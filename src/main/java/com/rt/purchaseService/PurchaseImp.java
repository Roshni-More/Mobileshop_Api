package com.rt.purchaseService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.PurchaseRequestDTO;
import com.rt.DTO.PurchaseRespDTO;
import com.rt.Dao.ProductDao;
import com.rt.Dao.PurchaseDao;
import com.rt.Dao.VendorDao;
import com.rt.Entity.ProductEntity;
import com.rt.Entity.Purchase;
import com.rt.Entity.Vendor;
import com.rt.purchaseInterface.PurchaseInterface;
import com.rt.purchaseMapper.PurchaseMapper;

@Service
public class PurchaseImp implements PurchaseInterface {

    @Autowired
    private PurchaseDao purchasedao;
    @Autowired
    private ProductDao productDao; 
    
    @Autowired
    private VendorDao vendorDao;

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public PurchaseRespDTO pruchasemanage(PurchaseRequestDTO purchaseRequestDTO) {

        // ✅ Fetch product from DB using ID
        ProductEntity product = productDao.findById(purchaseRequestDTO.getProductId()).orElse(null);
        if (product == null) {
            throw new RuntimeException("Product not found with ID: " + purchaseRequestDTO.getProductId());
        }
     // ✅ Fetch Vendor
        Vendor vendor = vendorDao.findById(purchaseRequestDTO.getVendorid()).orElse(null);
        if (vendor == null) {
            throw new RuntimeException("Vendor not found with ID: " + purchaseRequestDTO.getVendorid());
        }

        // ✅ Convert DTO to Entity and set Product
        Purchase purchase = purchaseMapper.toEntity(purchaseRequestDTO,vendor,product);
        
        purchase.setTotal(purchase.getQuantity() * purchase.getRate()); // Calculate total

        // ✅ Save purchase to DB
        Purchase savedPurchase = purchasedao.save(purchase);

		/*
		 * // ✅ Update product stock product.setStock(product.getStock() +
		 * purchase.getQuantity()); productDao.save(product);
		 */
        // ✅ Convert saved purchase to response DTO and return
        return purchaseMapper.toDto(savedPurchase);
    }

    @Override
    public List<PurchaseRespDTO> getAllPrducts() {
        List<Purchase> entityList = purchasedao.findAll();
        List<PurchaseRespDTO> dtoList = new ArrayList<>();

        for (Purchase entity : entityList) {
        	dtoList.add(purchaseMapper.toDto(entity));
        }

        return dtoList;
    }
}

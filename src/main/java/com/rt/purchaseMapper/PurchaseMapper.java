package com.rt.purchaseMapper;

import com.rt.DTO.PurchaseRequestDTO;
import com.rt.DTO.PurchaseRespDTO;
import com.rt.Entity.ProductEntity;
import com.rt.Entity.Purchase;
import com.rt.Entity.Vendor;

import org.springframework.stereotype.Component;

@Component
public class PurchaseMapper {

    public PurchaseRespDTO toDto(Purchase purchase) {
		
    	PurchaseRespDTO p=new PurchaseRespDTO();
    	p.setPurchaseId(purchase.getPurchaseId());
    	p.setVendorid(purchase.getVendor().getVendorid());
    	p.setVendorname(purchase.getVendor().getVendorname());
    	p.setProductName(purchase.getProduct().getName());
    	p.setQuantity(purchase.getQuantity());
    	p.setRate(purchase.getRate());
    	p.setSell(purchase.getSell());
    	p.setTotal(purchase.getTotal());
    	p.setPurchaseDate(purchase.getPurchaseDate());
    	return p;  
    }
    public Purchase toEntity(PurchaseRequestDTO dto,Vendor vendor, ProductEntity product) {
    	Purchase ph=new Purchase();
    	ph.setVendor(vendor);           // ✅ Proper Vendor entity
        ph.setProduct(product);  
    	ph.setPurchaseDate(dto.getPurchaseDate());
    	ph.setQuantity(dto.getQuantity());
    	ph.setRate(dto.getRate());
    	ph.setSell(dto.getSell());
    	ph.setTotal(dto.getTotal());
    	
        return ph;
    }
}

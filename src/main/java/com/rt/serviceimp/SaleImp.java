package com.rt.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.SaleRequestDTO;
import com.rt.DTO.SaleResponseDTO;
import com.rt.Dao.CustomerDao;
import com.rt.Dao.ProductDao;
import com.rt.Dao.PurchaseDao;
import com.rt.Dao.SalesDao;
import com.rt.Entity.Customer;
import com.rt.Entity.ProductEntity;
import com.rt.Entity.Sales;
import com.rt.Mapper.SalesMapper;
import com.rt.serviceinterface.SaleInterface;

@Service
public class SaleImp implements SaleInterface {
	
	@Autowired
	private SalesDao salesdao;
	
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private CustomerDao customerdao;
	
	@Autowired
	private SalesMapper salesmapper;

	
	@Override
	public SaleResponseDTO salemanage(SaleRequestDTO salereqdto) {
	    ProductEntity product = productdao.findById(salereqdto.getProductId())
	            .orElseThrow(() -> new RuntimeException("Product not found"));

	        Customer customer = customerdao.findById(salereqdto.getCustomerId())
	            .orElseThrow(() -> new RuntimeException("Customer not found"));
	           Sales sale = salesmapper.toEntity(salereqdto, product, customer);
	            Sales savedSale = salesdao.save(sale);
	        return salesmapper.toDto(savedSale);

	    }

	@Override
	public List<SaleResponseDTO> getAllPrducts() {
	    List<Sales> entityList = salesdao.findAll();
	    List<SaleResponseDTO> dtoList = new ArrayList<>();

	    for (Sales sale : entityList) {
	        SaleResponseDTO dto = salesmapper.toDto(sale);
	        dtoList.add(dto);
	    }


	    return dtoList;
	}

	
}

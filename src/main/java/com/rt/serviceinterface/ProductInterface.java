package com.rt.serviceinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rt.DTO.ProductRequestDTO;
import com.rt.DTO.ProductResponseDTO;

@Service
public interface ProductInterface {

 ProductResponseDTO productinsert(ProductRequestDTO productdto);

List<ProductResponseDTO> getAllProducts();	
	

}

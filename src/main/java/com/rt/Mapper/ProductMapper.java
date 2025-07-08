package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.ProductRequestDTO;
import com.rt.DTO.ProductResponseDTO;
import com.rt.Entity.ProductEntity;

@Component
public class ProductMapper {
	
	public ProductResponseDTO toDto(ProductEntity productuser) {
		return new ProductResponseDTO(productuser.getId(),productuser.getName(),productuser.getBrand(),productuser.getImei());
	}
public ProductEntity toEntity(ProductRequestDTO productdto) {
	return new ProductEntity( productdto.getName(),productdto.getBrand(),productdto.getImei());
	}
	
}

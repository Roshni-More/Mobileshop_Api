package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.SaleRequestDTO;
import com.rt.DTO.SaleResponseDTO;
import com.rt.Entity.Customer;
import com.rt.Entity.ProductEntity;
import com.rt.Entity.Sales;

@Component
public class SalesMapper {

	public Sales toEntity(SaleRequestDTO dto, ProductEntity product, Customer customer) {
		Sales sale = new Sales();
		sale.setQuantity(dto.getQuantity());
		sale.setSaleDate(dto.getSaleDate());
		sale.setProduct(product);
		sale.setCustomer(customer);
		return sale;
	}

	public SaleResponseDTO toDto(Sales sale) {
		SaleResponseDTO dto = new SaleResponseDTO();
		dto.setSaleId(sale.getSaleId());
		dto.setQuantity(sale.getQuantity());
		dto.setSaleDate(sale.getSaleDate());
		dto.setProductName(sale.getProduct().getName());
		dto.setCustomerName(sale.getCustomer().getCustomerName());

		return dto;
	}

}

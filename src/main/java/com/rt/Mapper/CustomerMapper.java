package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.CustomerRequestDTO;
import com.rt.DTO.CustomerResponseDTO;
import com.rt.Entity.Customer;

@Component
public class CustomerMapper {

	public CustomerResponseDTO toDto(Customer costomerdto) {
		return new CustomerResponseDTO(costomerdto.getCustomerId(),costomerdto.getCustomerName(),costomerdto.getMobileno(),costomerdto.getEmail(),costomerdto.getAddress());
		
	}
	
	public Customer toEntity(CustomerRequestDTO dto) {
		Customer c=new Customer();
		c.setCustomerId(dto.getCustomerId());
		c.setCustomerName(dto.getCustomerName());
		c.setAddress(dto.getAddress());
		c.setMobileno(dto.getMobileno());
		c.setEmail(dto.getEmail());
		return c;
		
	}
}

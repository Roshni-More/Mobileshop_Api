package com.rt.CustomerInterface;

import java.util.List;

import com.rt.DTO.CustomerRequestDTO;
import com.rt.DTO.CustomerResponseDTO;

public interface CustomerInterface {

	CustomerResponseDTO customeradded(CustomerRequestDTO customerdto);

	List<CustomerResponseDTO> getcustomer();

	CustomerResponseDTO showupdate(int customerId);

	CustomerResponseDTO showupdatedata(CustomerRequestDTO customerdto);

	boolean deleteById(int customerId);

}

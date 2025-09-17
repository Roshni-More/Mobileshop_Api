package com.rt.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.CustomerInterface.CustomerInterface;
import com.rt.DTO.CustomerRequestDTO;
import com.rt.DTO.CustomerResponseDTO;
import com.rt.Dao.CustomerDao;
import com.rt.Entity.Customer;
import com.rt.Mapper.CustomerMapper;

@Service
public class CustomerImp implements CustomerInterface {

	@Autowired
	private CustomerDao customerdao;

	@Autowired
	private CustomerMapper customermapper;

	@Override
	public CustomerResponseDTO customeradded(CustomerRequestDTO customerdto) {
		Customer entity = customermapper.toEntity(customerdto);
		Customer dataadd = customerdao.save(entity);
		CustomerResponseDTO respdto = customermapper.toDto(dataadd);
		return respdto;
	}

	@Override
	public List<CustomerResponseDTO> getcustomer() {
		List<Customer> entitylist = customerdao.findByIsDeletedFalse();
		List<CustomerResponseDTO> dtolist = new ArrayList<>();

		for (Customer entity : entitylist) {
			CustomerResponseDTO dto = new CustomerResponseDTO();
			dto.setCustomerId(entity.getCustomerId());
			dto.setCustomerName(entity.getCustomerName());
			dto.setMobileno(entity.getMobileno());
			dto.setAddress(entity.getAddress());
			dto.setEmail(entity.getEmail());
			dtolist.add(dto);
		}
		return dtolist;
	}

	@Override
	public CustomerResponseDTO showupdate(int customerId) {
		Optional<Customer> optionalProduct = customerdao.findById(customerId);
		if (optionalProduct.isPresent()) {
			Customer customer = optionalProduct.get();
			CustomerResponseDTO respdto = customermapper.toDto(customer);
			return respdto;
		}
		return null;
	}

	@Override
	public CustomerResponseDTO showupdatedata(CustomerRequestDTO customerdto) {
		System.out.println("customer updated data in api service :" + customerdto.getCustomerId() + " "
				+ customerdto.getCustomerName() + " " + customerdto.getAddress() + " " + customerdto.getEmail() + " "
				+ customerdto.getMobileno());

		Customer entity = customermapper.toEntity(customerdto);
		Customer dataadd = customerdao.save(entity);
		CustomerResponseDTO respdto = customermapper.toDto(dataadd);
		return respdto;
	}

	@Override
	public boolean deleteById(int customerId) {
		Optional<Customer> optionalCustomer = customerdao.findById(customerId);
		if (optionalCustomer.isPresent()) {
			Customer customer = optionalCustomer.get();
			customer.setDeleted(true);
			customerdao.save(customer);
			return true;
		}
		return false;
	}
}

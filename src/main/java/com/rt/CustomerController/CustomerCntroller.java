package com.rt.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.CustomerInterface.CustomerInterface;
import com.rt.DTO.CustomerRequestDTO;
import com.rt.DTO.CustomerResponseDTO;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")

public class CustomerCntroller {

	@Autowired
	private CustomerInterface customerinterface;

	@PostMapping("/customeradd")
	public CustomerResponseDTO customerinsert(@RequestBody CustomerRequestDTO customerdto) {
		CustomerResponseDTO isinsert = customerinterface.customeradded(customerdto);
		return isinsert;

	}

	@GetMapping("/customlist")
	public List<CustomerResponseDTO> showproduct() {
		List<CustomerResponseDTO> customers = customerinterface.getcustomer();
		return customers;
	}

	@GetMapping("/update")
	public CustomerResponseDTO updatepage(@RequestParam("customerId") int customerId) {
		System.out.println("✅ Received customerId = " + customerId);
		return customerinterface.showupdate(customerId);
	}

	@PostMapping("/select")
	public CustomerResponseDTO showcustomerdata(@RequestBody CustomerRequestDTO customerdto) {
		CustomerResponseDTO showcustomerupdate = customerinterface.showupdatedata(customerdto);
		return showcustomerupdate;
	}

	@DeleteMapping("/customer/deleted/{customerId}")
	public boolean deleteProduct(@PathVariable int customerId) {
		return customerinterface.deleteById(customerId);
	}
}

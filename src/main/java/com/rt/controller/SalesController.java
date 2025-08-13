package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.SaleRequestDTO;
import com.rt.DTO.SaleResponseDTO;
import com.rt.serviceinterface.SaleInterface;

@RestController
@CrossOrigin("*")
public class SalesController {

	@Autowired
	private SaleInterface saleinterface;
	
	@PostMapping("/Salesave")
	public SaleResponseDTO saleproduct(@RequestBody SaleRequestDTO salereqdto ){
		SaleResponseDTO salerespdto=saleinterface.salemanage(salereqdto);
		return salerespdto;
		
	}
	
	@GetMapping("/Savelist")
    public List<SaleResponseDTO> getallsale(){
		 List<SaleResponseDTO> saleData=saleinterface.getAllPrducts();
		return saleData;
		
	}
	
}

package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.UpdateRequestDTO;
import com.rt.DTO.UpdateResponseDTO;
import com.rt.Entity.ProductEntity;
import com.rt.serviceinterface.UpdateInterface;

@RestController
@CrossOrigin("*")
public class Updatecontroller {
	
	@Autowired 
	private UpdateInterface updateinterface;
	
	 @GetMapping("/update")
	public UpdateResponseDTO updatePage(@RequestParam("productId") int productId) {
		 UpdateResponseDTO product = updateinterface.showUpdate(productId); 
		
        return product;  
    }
	 @PostMapping("/select")
	 public UpdateResponseDTO showupdate(@RequestBody UpdateRequestDTO updatereqdto) {
		 UpdateResponseDTO showdata=updateinterface.showinsertdata(updatereqdto);
		 return showdata; 
	 }
	 @DeleteMapping("/delete")
	 public boolean deleteProduct(@RequestParam int productId) {
		 boolean deletedata=updateinterface.deleteById(productId);
	     return deletedata;
	 }

}

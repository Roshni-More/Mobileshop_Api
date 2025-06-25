package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.LoginResponseDTO;
import com.rt.DTO.RequestLoginDTO;
import com.rt.serviceimp.LoginService;


@RestController
@CrossOrigin("*")
public class Logincontroller {
	
	@Autowired
	private LoginService logService;
	
	@PostMapping("/login")
	public LoginResponseDTO loginData(@RequestBody RequestLoginDTO reqLog) {
		try {
		LoginResponseDTO logedUser=logService.loginUser(reqLog);
			
		if(logedUser!=null) {
			return logedUser;
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

}

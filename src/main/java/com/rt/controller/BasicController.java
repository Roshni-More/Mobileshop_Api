package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.SignupRequestDTO;
import com.rt.DTO.SignupResponseDTO;
import com.rt.serviceimp.SignupImp;


@RestController
@CrossOrigin("*")
public class BasicController {
	
	  @Autowired 
	  private SignupImp signupImp;
	 
	@PostMapping("/signup")
	public SignupResponseDTO signupdata(@RequestBody SignupRequestDTO signupdto) {
		SignupResponseDTO isadd=signupImp.addData(signupdto);
		
		return isadd;
	}
}

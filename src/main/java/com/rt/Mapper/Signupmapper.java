package com.rt.Mapper;

import org.springframework.stereotype.Component;


import com.rt.DTO.SignupRequestDTO;
import com.rt.DTO.SignupResponseDTO;
import com.rt.Entity.Signup;


@Component
public class Signupmapper {
	public SignupResponseDTO toDto(Signup user) {
	

	return new SignupResponseDTO( user.getUsername(),user.getEmail(),user.getAddress(),user.getPassword(),user.getRole());
	}
public Signup toEntity(SignupRequestDTO signup) {
	

	Signup s=new Signup();
	s.setId(signup.getId());
	s.setUsername(signup.getUsername());
	s.setEmail(signup.getEmail());
	s.setAddress(signup.getAddress());
	s.setPassword(signup.getPassword());
	
	s.setRole(signup.getRole());
	return s;
}
}
  
package com.rt.serviceinterface;

import org.springframework.stereotype.Service;

import com.rt.DTO.LoginResponseDTO;
import com.rt.DTO.RequestLoginDTO;

@Service
public interface LoginServiceInterface {
	
	LoginResponseDTO loginUser(RequestLoginDTO reqLog);

}

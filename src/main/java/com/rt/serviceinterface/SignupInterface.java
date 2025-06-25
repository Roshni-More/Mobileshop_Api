package com.rt.serviceinterface;

import org.springframework.stereotype.Service;

import com.rt.DTO.SignupRequestDTO;
import com.rt.DTO.SignupResponseDTO;

@Service

public interface SignupInterface {

	SignupResponseDTO addData(SignupRequestDTO signupdto);
}

package com.rt.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.LoginResponseDTO;
import com.rt.DTO.RequestLoginDTO;
import com.rt.Dao.LoginRepository;
import com.rt.serviceinterface.LoginServiceInterface;
@Service
public class LoginService implements LoginServiceInterface{
@Autowired
private LoginRepository loginRepo;
	

	@Override
	public LoginResponseDTO loginUser(RequestLoginDTO reqLog) {
	Optional<LoginResponseDTO>opt=loginRepo.loginUser(reqLog.getEmail(),reqLog.getPassword());
		
		System.out.println("email is get");
	if(opt.isPresent()) {
		LoginResponseDTO logedUser=opt.get();
		return logedUser;
	}
		return null;
	}

	

}

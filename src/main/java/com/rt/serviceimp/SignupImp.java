
package com.rt.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.SignupRequestDTO;
import com.rt.DTO.SignupResponseDTO;
import com.rt.Dao.SignupDao;
import com.rt.Entity.Signup;
import com.rt.Mapper.Signupmapper;
import com.rt.serviceinterface.*;

@Service
public class SignupImp implements SignupInterface {

	@Autowired
	private SignupDao databasesignup;

	@Autowired
	private Signupmapper mapperclass;

	@Override
	public SignupResponseDTO addData(SignupRequestDTO signupdto) {
		Signup entity = mapperclass.toEntity(signupdto);
		Signup dataAdd=databasesignup.save(entity);
		 SignupResponseDTO respDTO= mapperclass.toDto(dataAdd);
		return respDTO;
	}
}

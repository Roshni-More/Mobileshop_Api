package com.rt.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.ProductResponseDTO;
import com.rt.DTO.UpdateRequestDTO;
import com.rt.DTO.UpdateResponseDTO;
import com.rt.Dao.ProductDao;
import com.rt.Entity.ProductEntity;
import com.rt.Mapper.UpdateMapper;
import com.rt.serviceinterface.UpdateInterface;

@Service
public class UpdateImp implements UpdateInterface {
	
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private UpdateMapper updatemapper;

	@Override
	public UpdateResponseDTO showUpdate(int id) {
		Optional<ProductEntity> optionalProduct = productdao.findById(id);
		if(optionalProduct.isPresent()) {
			ProductEntity productentity=optionalProduct.get();
			UpdateResponseDTO resdto=updatemapper.toDto(productentity);
			return resdto;
		}
		return null;
	}

	@Override
	public UpdateResponseDTO showinsertdata(UpdateRequestDTO updatereqdto) {
		ProductEntity entity=updatemapper.toEntity(updatereqdto);
		
		ProductEntity dataadd=productdao.save(entity);
		System.out.println("before updation id :"+updatereqdto.getId()+" after updation id :"+dataadd.getId());
		
		UpdateResponseDTO respdto=updatemapper.toDto(dataadd);
		return respdto;
	}

	@Override
	public boolean deleteById(int id) {
		 if (productdao.existsById(id)) {
			 productdao.deleteById(id);
	            return true;
	        } else {
		return false;
	}
}
}

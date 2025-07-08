package com.rt.Mapper;

import org.springframework.stereotype.Component;
import com.rt.DTO.UpdateRequestDTO;
import com.rt.DTO.UpdateResponseDTO;
import com.rt.Entity.ProductEntity;

@Component
public class UpdateMapper {


	public UpdateResponseDTO toDto(ProductEntity productuser) {
		return new UpdateResponseDTO(productuser.getId(),productuser.getName(),productuser.getBrand(),productuser.getImei());
		
	}
	public ProductEntity toEntity(UpdateRequestDTO updatedto) {
		return new ProductEntity( updatedto.getId(),updatedto.getName(),updatedto.getBrand(),updatedto.getImei());
		
	}
		
}

package com.rt.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.ProductRequestDTO;
import com.rt.DTO.ProductResponseDTO;
import com.rt.Dao.ProductDao;
import com.rt.Entity.ProductEntity;
import com.rt.Mapper.ProductMapper;
import com.rt.serviceinterface.ProductInterface;

@Service
public class ProductImp implements ProductInterface{
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private ProductMapper productmapper;

	@Override
	public ProductResponseDTO productinsert(ProductRequestDTO productdto) {
		ProductEntity entity=productmapper.toEntity(productdto);
		ProductEntity dataadd=productdao.save(entity);
		ProductResponseDTO respdto=productmapper.toDto(dataadd);
		return respdto;
		
	}

	@Override
	public List<ProductResponseDTO> getAllProducts() {
	    List<ProductEntity> entityList = productdao.findAll();
	    List<ProductResponseDTO> dtoList = new ArrayList<>();

	    for (ProductEntity entity : entityList) {
	        ProductResponseDTO dto = new ProductResponseDTO();
	        dto.setId(entity.getId());
	        dto.setName(entity.getName());
	        dto.setBrand(entity.getBrand());
	        dto.setImei(entity.getImei());
	       

	        dtoList.add(dto);
	    }

	    return dtoList;
	}

}

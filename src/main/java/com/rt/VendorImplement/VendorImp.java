package com.rt.VendorImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.VendorRequestDto;
import com.rt.DTO.VendorResponseDto;
import com.rt.DTO.VendorUpdateReqDTO;
import com.rt.DTO.VendorUpdateRespDTO;
import com.rt.Dao.VendorDao;
import com.rt.Entity.Vendor;
import com.rt.Mapper.VendorMapper;
import com.rt.Mapper.VendorUpdateMapper;
import com.rt.VendorInterface.VendorInterface;

@Service
public class VendorImp implements VendorInterface {

	@Autowired
	private VendorDao vendordao;

	@Autowired
	private VendorMapper vendormapper;

	@Autowired
	private VendorUpdateMapper vendorupdatemapper;

	@Override
	public VendorResponseDto vendoradd(VendorRequestDto vendordto) {
		Vendor entity = vendormapper.toEntity(vendordto);
		Vendor adddata = vendordao.save(entity);
		VendorResponseDto respdto = vendormapper.toDto(adddata);
		return respdto;
	}

	@Override
	public List<VendorResponseDto> getAllProducts() {
		List<Vendor> entitylist = vendordao.findByIsDeletedFalse();
		List<VendorResponseDto> dtolist = new ArrayList<>();
		for (Vendor entity : entitylist) {
			VendorResponseDto dto = new VendorResponseDto();
			dto.setVendorid(entity.getVendorid());
			dto.setVendorname(entity.getVendorname());
			dto.setMobileno(entity.getMobileno());
			dtolist.add(dto);

		}
		return dtolist;
	}

	@Override
	public VendorUpdateRespDTO showupdatedata(int vendorid) {
		Optional<Vendor> optionalProduct = vendordao.findById(vendorid);
		if (optionalProduct.isPresent()) {
			Vendor vendor = optionalProduct.get();
			VendorUpdateRespDTO resdto = vendorupdatemapper.toDto(vendor);
			return resdto;
		}
		return null;
	}

	@Override
	public VendorUpdateRespDTO displaydata(VendorUpdateReqDTO updatedto) {
		Vendor entity = vendorupdatemapper.toEntity(updatedto);
		Vendor dataadd = vendordao.save(entity);
		VendorUpdateRespDTO respdto = vendorupdatemapper.toDto(dataadd);
		return respdto;

	}

	@Override
	public boolean deleteById(int vendorid) {
		Optional<Vendor> optionalVendor = vendordao.findById(vendorid);
		if (optionalVendor.isPresent()) {
			Vendor vendor = optionalVendor.get();
			vendor.setDeleted(true);
			vendordao.save(vendor);
			return true;
		}
		return false;
	}

}

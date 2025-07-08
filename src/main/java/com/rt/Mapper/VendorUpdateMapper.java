package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.VendorUpdateReqDTO;
import com.rt.DTO.VendorUpdateRespDTO;
import com.rt.Entity.Vendor;

@Component
public class VendorUpdateMapper {
	public VendorUpdateRespDTO toDto(Vendor vendor) {
		return new VendorUpdateRespDTO(vendor.getVendorid(),vendor.getVendorname(),vendor.getMobileno());
		
	}
	public Vendor toEntity(VendorUpdateReqDTO reqdto) {
		return new Vendor(reqdto.getVendorid(),reqdto.getVendorname(),reqdto.getMobileno());
		
	}

}

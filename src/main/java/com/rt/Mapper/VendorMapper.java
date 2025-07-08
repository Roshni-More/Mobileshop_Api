package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.VendorRequestDto;
import com.rt.DTO.VendorResponseDto;
import com.rt.Entity.Vendor;

@Component
public class VendorMapper {
	public VendorResponseDto toDto(Vendor vendor) {
		VendorResponseDto dto = new VendorResponseDto();
        dto.setVendorid(vendor.getVendorid());
        dto.setVendorname(vendor.getVendorname());
        dto.setMobileno(vendor.getMobileno());
        return dto;
    }

    public Vendor toEntity(VendorRequestDto dto) {
        Vendor vendor = new Vendor();
        
        vendor.setVendorname(dto.getVendorname());
        vendor.setMobileno(dto.getMobileno());
        return vendor;
    }
}

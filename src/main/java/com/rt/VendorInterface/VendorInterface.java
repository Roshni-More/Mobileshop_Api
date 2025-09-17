package com.rt.VendorInterface;

import java.util.List;

import com.rt.DTO.VendorRequestDto;
import com.rt.DTO.VendorResponseDto;
import com.rt.DTO.VendorUpdateReqDTO;
import com.rt.DTO.VendorUpdateRespDTO;

public interface VendorInterface {

	public VendorResponseDto vendoradd(VendorRequestDto vendordto);

	public List<VendorResponseDto> getAllProducts();

	public VendorUpdateRespDTO showupdatedata(int vendorid);

	public VendorUpdateRespDTO displaydata(VendorUpdateReqDTO updatedto);

	public boolean deleteById(int vendorid);

}

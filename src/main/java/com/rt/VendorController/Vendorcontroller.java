package com.rt.VendorController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.VendorRequestDto;
import com.rt.DTO.VendorResponseDto;
import com.rt.DTO.VendorUpdateReqDTO;
import com.rt.DTO.VendorUpdateRespDTO;
import com.rt.VendorInterface.VendorInterface;

@RestController
@CrossOrigin("*")
public class Vendorcontroller {

	@Autowired
	private VendorInterface vendorinterface;

	@PostMapping("/insert")
	public VendorResponseDto vendoradd(@RequestBody VendorRequestDto vendordto) {
		VendorResponseDto vendorresponse = vendorinterface.vendoradd(vendordto);
		return vendorresponse;
	}

	@GetMapping("/vendorlist")
	public List<VendorResponseDto> showvendor() {
		List<VendorResponseDto> vendors = vendorinterface.getAllProducts();
		return vendors;
	}

	@GetMapping("/vendorupdate")
	public VendorUpdateRespDTO updatedata(@RequestParam int vendorid) {
		VendorUpdateRespDTO showdata = vendorinterface.showupdatedata(vendorid);
		return showdata;
	}

	@PostMapping("/vendorselect")
	public VendorUpdateRespDTO showdata(@RequestBody VendorUpdateReqDTO updatedto) {
		VendorUpdateRespDTO showupdate = vendorinterface.displaydata(updatedto);
		return showupdate;

	}

	@DeleteMapping("/vendor/deleted/{vendorid}")
	public boolean deleteProduct(@PathVariable int vendorid) {
		return vendorinterface.deleteById(vendorid);
	}

}

package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorResponseDto {

	private int vendorid;
	private String vendorname;
	private String mobileno;
}

package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {

	private int CustomerId;
	private String customerName;
	private String mobileno;
	private String email;
	private String address;
}

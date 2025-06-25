package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupResponseDTO {

	private String username;
	private String email;
	private String address;
	private int password;
	
	private String role;
}

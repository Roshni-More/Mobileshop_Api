package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {

	private int id;
	private String name;
    private String brand;
    private String imei;
    
    
}

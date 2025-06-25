package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateResponseDTO {
	
	private int id;
	private String name;
    private String brand;
    private String imei;
    private int stock;
    private float purchasePrice;
    private float sellingPrice;
}

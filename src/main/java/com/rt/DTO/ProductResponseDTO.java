package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {

	private int ProductId;
	private String name;
    private String brand;
    private String imei;
    private int stock;
	public ProductResponseDTO(int productId, String name, String brand, String imei) {
		super();
		ProductId = productId;
		this.name = name;
		this.brand = brand;
		this.imei = imei;
	} 
    
    
    
    
}

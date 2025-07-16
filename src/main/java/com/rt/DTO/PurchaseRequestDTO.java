package com.rt.DTO;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PurchaseRequestDTO {

	private int Purchaseid;
	private int vendorid;
	private int productId;
	 private String productName;
	private int quantity;
	private float rate;
	private float sell;
	private float total;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date purchaseDate; 

}

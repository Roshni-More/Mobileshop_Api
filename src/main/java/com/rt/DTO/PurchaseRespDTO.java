package com.rt.DTO;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PurchaseRespDTO {
	  private int purchaseId;
	    private String vendorname;
	    private String productName;
	    private int quantity;
	    private float rate;
	    private float sell;
	    private float total;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date purchaseDate;
}

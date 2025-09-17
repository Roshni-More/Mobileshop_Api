package com.rt.DTO;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleRequestDTO {
	private int saleId;
	private int CustomerId;
	private int productId;
	private int quantity;
	private String customerName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate saleDate;

}

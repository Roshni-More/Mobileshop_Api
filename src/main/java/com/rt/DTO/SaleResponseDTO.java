package com.rt.DTO;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleResponseDTO {

	private int saleId;
    private String customerName;
    private String productName;
    private int quantity;
    private LocalDate saleDate;

}

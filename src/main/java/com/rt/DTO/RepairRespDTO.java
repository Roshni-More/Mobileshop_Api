package com.rt.DTO;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepairRespDTO {

	private int repairId;
	private String customerName;
    private String productName;
    private String brand;
    private String imei;
    private String issueDescription;
    private String repairStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate repairDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deliveryDate;
    private int repairCost;

}

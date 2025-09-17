package com.rt.Entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "repairs")
public class Repair {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int repairId;

	private String customerName;

	private String productName;

	private String imei;

	private String issueDescription;

	private String repairStatus;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate repairDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate deliveryDate;

	private int repairCost;
	private boolean isDeleted = false;

}

package com.rt.Entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sales")
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int saleId;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity product;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	private int quantity;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate saleDate;
	private boolean isDeleted = false;

}

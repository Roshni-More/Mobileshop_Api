package com.rt.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "purchases")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;

	@ManyToOne
	@JoinColumn(name = "vendorid")
	private Vendor vendor;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity product;

	private int quantity;

	private float rate;
	private float sell;
	private float total;
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	private boolean isDeleted = false;
	// Getters and Setters
}

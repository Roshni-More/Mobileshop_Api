package com.rt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
    private String brand;
	@Column
    private String imei;
	@Column(name="stock")
    private int stock;
	@Column(name="purchasePrice")
    private float purchasePrice;
	@Column(name="sellingPrice")
    private float sellingPrice;
	

	public ProductEntity(String name, String brand, String imei, int stock, float purchasePrice, float sellingPrice) {
		super();
		this.name = name;
		this.brand = brand;
		this.imei = imei;
		this.stock = stock;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		
	}

	
	
}

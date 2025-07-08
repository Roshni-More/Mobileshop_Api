package com.rt.Entity;

import java.util.Date;

import jakarta.persistence.*;
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
    @JoinColumn(name="vendorid")
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

    // Getters and Setters
}

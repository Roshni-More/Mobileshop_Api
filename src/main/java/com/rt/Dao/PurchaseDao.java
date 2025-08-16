package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Purchase;

@Repository
public interface PurchaseDao extends JpaRepository<Purchase,Integer>{

	@Query("SELECT SUM(p.quantity) FROM Purchase p WHERE p.product.productId = :productId")
	Integer getTotalQuantityByProductId(@Param("productId") Integer productId);

	
}

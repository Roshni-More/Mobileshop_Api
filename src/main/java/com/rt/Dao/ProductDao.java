package com.rt.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Customer;
import com.rt.Entity.ProductEntity;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity,Integer> {
	Optional<ProductEntity> findById(int productId);

}

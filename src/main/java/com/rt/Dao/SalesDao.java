package com.rt.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.ProductEntity;
import com.rt.Entity.Sales;

@Repository
public interface SalesDao extends JpaRepository<Sales, Integer> {

	Optional<ProductEntity> findBySaleid(int id);

}

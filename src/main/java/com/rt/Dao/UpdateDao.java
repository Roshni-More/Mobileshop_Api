package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.ProductEntity;

@Repository
public interface UpdateDao extends JpaRepository<ProductEntity,Integer> {
	

}

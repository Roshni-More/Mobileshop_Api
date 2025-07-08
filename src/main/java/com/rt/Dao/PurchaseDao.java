package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Purchase;

@Repository
public interface PurchaseDao extends JpaRepository<Purchase,Integer>{

	

}

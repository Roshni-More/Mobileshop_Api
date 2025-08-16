package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Sales;

@Repository
public interface SalesDao extends JpaRepository<Sales,Integer> {

	

}

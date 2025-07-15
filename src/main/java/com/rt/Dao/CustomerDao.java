package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{

}

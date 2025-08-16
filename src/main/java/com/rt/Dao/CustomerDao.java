package com.rt.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.rt.Entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{
	Optional<Customer> findById(int custmerId);
	
}

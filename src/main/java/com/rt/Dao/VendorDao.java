package com.rt.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Vendor;

@Repository
public interface VendorDao extends JpaRepository<Vendor, Integer> {

	List<Vendor> findByIsDeletedFalse();

}

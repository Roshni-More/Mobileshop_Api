package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Vendor;

@Repository
public interface VendorDao extends JpaRepository<Vendor,Integer> {

}

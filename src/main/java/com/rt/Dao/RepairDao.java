package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entity.Repair;

@Repository
public interface RepairDao extends JpaRepository<Repair,Integer>{

}

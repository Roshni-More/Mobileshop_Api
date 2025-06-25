
 package com.rt.Dao;
  
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

import com.rt.Entity.Signup;
  
  @Repository
  public interface SignupDao extends JpaRepository<Signup,Integer> {
  }
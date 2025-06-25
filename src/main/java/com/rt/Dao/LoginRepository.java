package com.rt.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rt.DTO.LoginResponseDTO;
import com.rt.Entity.Signup;
@Repository
public interface LoginRepository extends JpaRepository<Signup,Integer>{
	
	@Query("SELECT  u.email AS email, u.role AS role FROM Signup u WHERE u.email = :email AND u.password = :password")
    Optional<LoginResponseDTO> loginUser(@Param("email") String email, @Param("password") int password);

	/* Optional<LoginResponseDTO> findByEmail(String string); */

}

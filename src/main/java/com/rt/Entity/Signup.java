package com.rt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class Signup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="password")
	private int password;
	
	
	
	@Column(name="role")
	private String role;
	
	
	/*
	 * public Signup(int id, String username, String email, String address, int
	 * password, String role) { super(); this.id = id; this.username = username;
	 * this.email = email; this.address = address; this.password = password;
	 * this.role = role; } public int getId() { return id; } public void setId(int
	 * id) { this.id = id; } public String getUsername() { return username; } public
	 * void setUsername(String username) { this.username = username; } public String
	 * getEmail() { return email; } public void setEmail(String email) { this.email
	 * = email; } public String getAddress() { return address; } public void
	 * setAddress(String address) { this.address = address; } public int
	 * getPassword() { return password; } public void setPassword(int password) {
	 * this.password = password; } public String getRole() { return role; } public
	 * void setRole(String role) { this.role = role; }
	 * 
	 */
}

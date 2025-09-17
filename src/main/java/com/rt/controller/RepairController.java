package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.RepairRespDTO;
import com.rt.serviceinterface.RepairInterface;

@RestController
@CrossOrigin("*")
public class RepairController {

	@Autowired
	private RepairInterface repairinterface;

	@PostMapping("/productrepair")
	public RepairRespDTO repairform(@RequestBody RepairRespDTO repairdto) {
		RepairRespDTO repair = repairinterface.repairproduct(repairdto);
		return repair;
	}

	@GetMapping("/repairlist")
	public List<RepairRespDTO> showrepair() {
		List<RepairRespDTO> repairproduct = repairinterface.getallproducts();
		return repairproduct;
	}

	@DeleteMapping("/api/repair/deleted/{repairId}")
	public boolean deleteProduct(@PathVariable int repairId) {
		return repairinterface.deleteById(repairId);
	}
}

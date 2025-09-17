package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.ProductRequestDTO;
import com.rt.DTO.ProductResponseDTO;
import com.rt.serviceinterface.ProductInterface;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductInterface productinterface;

	@PostMapping("/product")
	public ProductResponseDTO productform(@RequestBody ProductRequestDTO productdto) {
		ProductResponseDTO isinsert = productinterface.productinsert(productdto);

		return isinsert;

	}

	@GetMapping("/productList")
	public List<ProductResponseDTO> showProduct() {
		List<ProductResponseDTO> products = productinterface.getAllProducts();

		return products;
	}

	@DeleteMapping("/deleted/{productId}")
	public boolean deleteProduct(@PathVariable int productId) {
		return productinterface.deleteById(productId);
	}
}

package com.rt.homecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@GetMapping("/")
	public String homepage() {
		
		return "hello world";
	}
}

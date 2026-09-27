package com.demo.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContaimer {
	
	@GetMapping("/get")
	public String Demo() {
		return "This is Demo Project for Deployment purpose";
	}

}

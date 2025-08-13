package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String showMsg() {
		return "WELCOME TO HOME.....!!!";
	}
	
	
	@GetMapping("/wish")
	public String wishMsg() {
			return "GOOD MORNING...!!!";
		}
		
	}
	


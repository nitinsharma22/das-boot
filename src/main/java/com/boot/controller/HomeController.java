package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Das Boot, reporting for duty!");
		return "Das Boot, reporting for duty!";
	}

}

package com.esprit.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestApi {
	@RequestMapping("/hello")
	public String sayHallo() {
		System.out.println("aaa");
		return "aaa";
	}
}

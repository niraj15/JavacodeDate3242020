package com.Fedex.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAddController {
	@RequestMapping("/hello")
	public String hi() {
		return "Hello Niraj How R U";
	}
	@RequestMapping("/annualsalary")
	public int sum() {
	int a=10;
	int b=20;
	int sum = a+b;
	return sum;
	
	}

	@RequestMapping(method=RequestMethod.POST)
			public void adddata() {
		
	}
	
	
}


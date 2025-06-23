package com.studentcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Batchcontroller {
	
	
	@PostMapping("/addition/{num1}/{num2}")
	public int addition(@PathVariable int num1,@PathVariable int num2)
	{
		int res = num1 + num2;

		System.out.println("addition");
		return res;
		
	}

}

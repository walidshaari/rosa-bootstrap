package com.perficient.apimc.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping("/echo")
	public String echo(@RequestParam String message) {
		
		return message + "-fake-prod";
	}
	
	@GetMapping("/error")
	public String error() {
		
		throw new RuntimeException("Forced error");
	}
}

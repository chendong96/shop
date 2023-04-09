package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

	@GetMapping
	public String list() {
		return "hello world";
	}
}

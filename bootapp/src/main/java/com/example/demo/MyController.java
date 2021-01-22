package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/books")
	public String getBooks(){
		return "Mahabhrat, Ramayana";
	}
}

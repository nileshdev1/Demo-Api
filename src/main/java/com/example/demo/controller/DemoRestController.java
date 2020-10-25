package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoRestController {

	@GetMapping("/msg")
	public ResponseEntity<String> getMsg() {
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
}

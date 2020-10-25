package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Detail;
import com.example.demo.service.IDemoService;

@RestController
@RequestMapping("/api")
public class DemoRestController {

	private IDemoService service;
	
	@GetMapping("/msg")
	public ResponseEntity<String> getMsg() {
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveData(@RequestBody Detail dtl){
		ResponseEntity<?> resp=null;
		
		try {
			if(dtl!=null) {
				service.signUp(dtl);
			}
			resp=new ResponseEntity<String>("Data Recorded",HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<String>("Internal Problem",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
}

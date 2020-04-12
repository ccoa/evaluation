package com.occoa.evaluation.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/tests")
@RestController
@CrossOrigin
public class TestController {
	
	@GetMapping
	public ResponseEntity<Object> getEvaluations() {
		
		return new ResponseEntity<Object>(new ArrayList<>(), HttpStatus.OK);
	}
}

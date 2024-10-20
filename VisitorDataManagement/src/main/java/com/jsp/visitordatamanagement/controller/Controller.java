package com.jsp.visitordatamanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.visitordatamanagement.entity.VEntity;
import com.jsp.visitordatamanagement.service.VService;

@RestController
public class Controller {
	
	@Autowired
	private VService service;
	
//	@PostMapping("/visitor")
//	public @ResponseBody VEntity saveVisitor(@RequestBody VEntity entity) {
//		return service.saveVisitor(entity);
//	}
	
	@PostMapping("/visitor")
	public @ResponseBody  VEntity saveCustomer(@RequestBody VEntity entity) {
		return service.saveVisitor(entity);// Test Passed
	}

}

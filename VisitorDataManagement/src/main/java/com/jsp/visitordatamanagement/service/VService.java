package com.jsp.visitordatamanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.visitordatamanagement.entity.VEntity;
import com.jsp.visitordatamanagement.repository.Repository;

@Service
public class VService {
	
//	@Autowired
//	private SessionFactory session;
	
	@Autowired
	private Repository repository;
	

	public VEntity saveVisitor(VEntity entity) {
		return repository.save(entity);		
	}

}

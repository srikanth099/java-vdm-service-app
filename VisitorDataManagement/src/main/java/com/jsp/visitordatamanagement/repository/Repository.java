package com.jsp.visitordatamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.visitordatamanagement.entity.VEntity;

public interface Repository extends JpaRepository<VEntity, Integer>{

}

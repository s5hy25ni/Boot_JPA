package com.sh.edu.service;

import org.springframework.data.repository.CrudRepository;

import com.sh.edu.vo.Emp;

public interface EmpRepository extends CrudRepository<Emp, Long> {
	
}

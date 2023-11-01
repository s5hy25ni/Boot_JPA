package com.sh.edu.service;

import org.springframework.data.repository.CrudRepository;

import com.sh.edu.vo.Dept;

public interface DeptRepository extends CrudRepository<Dept, Long> {

}

package com.sh.edu.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sh.edu.service.EmpRepository;
import com.sh.edu.vo.Emp;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmpController {
	
	@Autowired
	private EmpRepository empRepository;
	
	@RequestMapping("/emp")
	public Iterable<Emp> getEmps(){
		log.info("전체 사원 조회");
		return empRepository.findAll();
	}
}

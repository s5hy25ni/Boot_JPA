package com.sh.edu;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sh.edu.service.EmpRepository;
import com.sh.edu.vo.Emp;

@SpringBootTest
class SpringBootBoardPracApplicationTests {

	@Autowired
	private EmpRepository empRepository;
	
	@Test
	void contextLoads() {
		Iterable<Emp> all = empRepository.findAll();
		assertNotNull(all);
	}

}

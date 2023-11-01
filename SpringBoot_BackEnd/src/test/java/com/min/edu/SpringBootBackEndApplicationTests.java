package com.min.edu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.min.edu.service.CarRepository;
import com.min.edu.service.OwnerRepository;
import com.min.edu.service2.CourseRepository;
import com.min.edu.service2.EvaluationRepository;
import com.min.edu.service2.StudentRepository;
import com.min.edu.vo.Car;
import com.min.edu.vo.Owner;
import com.min.edu.vo2.Student;

@SpringBootTest
class SpringBootBackEndApplicationTests {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private EvaluationRepository evaluationRepository;
	
	@Test
	void carRepository_Test() {
		List<Car> find = carRepository.findByBrand("Kia");
		System.out.println();
		assertEquals(find.size(), 1);
	}
	
//	@Test
	void ownerRepository_Test( ) {
		List<Owner> find = (List<Owner>)ownerRepository.findAll();
		System.out.println("조인된 0번째 데이터의 Car : " +find.get(0).getCars());
		assertNotNull(find);
	}
	
//	@Test
	@Transactional
	void test() {
		Optional<Student> stu = studentRepository.findById(1L);
		System.out.println(stu.get().getStudentCourse());
		assertNotNull(stu);
	}

}

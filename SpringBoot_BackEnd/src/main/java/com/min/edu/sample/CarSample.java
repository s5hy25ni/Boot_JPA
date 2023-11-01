package com.min.edu.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.min.edu.service.CarRepository;
import com.min.edu.service.OwnerRepository;
import com.min.edu.service.UserRepository;
import com.min.edu.service2.CourseRepository;
import com.min.edu.service2.EvaluationRepository;
import com.min.edu.service2.StudentRepository;
import com.min.edu.vo.Car;
import com.min.edu.vo.Owner;
import com.min.edu.vo.User;
import com.min.edu.vo2.Course;
import com.min.edu.vo2.Evaluation;
import com.min.edu.vo2.Student;

@Configuration
public class CarSample {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private EvaluationRepository evaluationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Bean
	CommandLineRunner commandLineRunner(CarRepository repository, OwnerRepository ownerRepository) {
		return args -> {
//			Car ford = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 590000);
//			Car hyundai = new Car("Hyundai", "avante", "Green", "SSJ-3002", 2019, 290000);
//			Car ray = new Car("Kia", "ray", "white", "KKO-0212", 2020, 390000);
			
			Owner owner1 = new Owner("Marry", "Cristmas");
			Owner owner2 = new Owner("Jonn", "Robinson");
			Car ford = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 590000, owner1);
			Car hyundai = new Car("Hyundai", "avante", "Green", "SSJ-3002", 2019, 290000, owner2);
			Car ray = new Car("Kia", "ray", "white", "KKO-0212", 2020, 390000, owner2);
			ownerRepository.saveAll(List.of(owner1, owner2));
			
			repository.saveAll(List.of(ford,hyundai,ray));
			
			Student s1 = new Student();
			s1.setName("KOKOA");
			Student s2 = new Student();
			s2.setName("BANANA");
			
			Course c1 = new Course();
			c1.setTitle("JAVA");
			Course c2 = new Course();
			c2.setTitle("HTML");
			
			Evaluation e1 = new Evaluation(100, c1, s1);
			Evaluation e2 = new Evaluation(80, c2, s1);
			Evaluation e3 = new Evaluation(90, c1, s2);
			
			studentRepository.saveAll(List.of(s1,s2));
			courseRepository.saveAll(List.of(c1,c2));
			evaluationRepository.saveAll(List.of(e1,e2,e3));
			
			User u1 = new User("user", "$2y$04$bU05.XX3UL2HSYxXt3E9qOAJboRapRWaRjaXA/VQtij9GiPu/Kqbm", "USER");
			User u2 = new User("admin", "$2y$04$ud4YRoDh5syDCudQCxyhheAr5BMHQMD5ak9EaHV5Yg8Z7h0w0Lg3C", "ADMIN");
			
			userRepository.saveAll(List.of(u1,u2));
		};
	}
}

package com.min.edu.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.min.edu.service.CarRepository;
import com.min.edu.vo.Car;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		log.info("전체 차 테이블 조회");
		return carRepository.findAll();
	}
}

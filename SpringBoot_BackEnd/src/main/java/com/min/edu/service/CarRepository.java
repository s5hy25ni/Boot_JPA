package com.min.edu.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.min.edu.vo.Car;

@RepositoryRestResource(path="vehicles")
public interface CarRepository extends CrudRepository<Car, Long>{
	List<Car> findByBrand(@Param("brand") String brand);
	List<Car> findByColor(@Param("color") String color);
	List<Car> findByProductYear(Integer productYear);
	
	List<Car> findByBrandAndModel(String brand, String model);
	List<Car> findByBrandOrModel(String brand, String model);
	
	List<Car> findByBrandOrderByProductYearAsc(Object brandOrderByProductYear);
	
	@Query("select c from Car c where c.brand=?1")
	List<Car> findByBrandQuery(String findByBrand);
	
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String Brand);
	
}

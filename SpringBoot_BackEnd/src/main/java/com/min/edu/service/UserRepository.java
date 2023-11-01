package com.min.edu.service;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.min.edu.vo.User;

@RepositoryRestResource(exported=false)
public interface UserRepository extends CrudRepository<User, Long>{

	Optional<User> findByUsername(String username);

}

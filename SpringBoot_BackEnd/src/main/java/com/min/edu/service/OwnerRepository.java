package com.min.edu.service;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.min.edu.vo.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

}

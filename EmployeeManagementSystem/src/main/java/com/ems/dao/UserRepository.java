package com.ems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
	
}

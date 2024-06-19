package com.ems.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.RolesRepository;
import com.ems.dao.UserRepository;
import com.ems.model.Roles;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RolesRepository roleRepository;

	public List<Roles> getAllRoles()
	{
		return (List<Roles>) roleRepository.findAll();
	}
}

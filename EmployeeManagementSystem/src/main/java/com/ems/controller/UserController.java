package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.exceptions.UserException;
import com.ems.model.Roles;
import com.ems.service.UserService;
import com.ems.service.UserServiceImpl;

@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
	private UserServiceImpl userserviceimpl;
	
	@GetMapping("/roles")
	public ResponseEntity<List<Roles>> getAllRoles()
	{
		List<Roles>rolelist=userserviceimpl.getAllRoles();
		if(rolelist.size()<=0)
		{
			throw new UserException("no roles are found");
		}
		return ResponseEntity.ok(rolelist);
	}
	
	
	
	
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> handleUserNotFoundException(UserException ex)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
}

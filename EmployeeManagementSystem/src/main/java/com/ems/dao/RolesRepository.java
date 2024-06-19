package com.ems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.Roles;

@Repository
public interface RolesRepository extends CrudRepository<Roles,Integer>{

}

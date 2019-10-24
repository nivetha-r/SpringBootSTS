package com.nivi.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer>{
	
	public User getUserByUsername(String username);
	

}

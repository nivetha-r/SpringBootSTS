package com.loan.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer>{
	
	public User getLoanByUsername(String username);

	
	

}

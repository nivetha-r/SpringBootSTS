package com.loan.model;

import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Login, Integer>{

	public Login getLoginByUsername(String username);
	

	
	
}

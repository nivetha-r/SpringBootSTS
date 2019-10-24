package com.nisha.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;



public interface AccountRepository  extends CrudRepository<Account, Integer>{

	
	public List<Account> getAccountByuserid(Integer userid);
	

}

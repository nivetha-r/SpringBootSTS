package com.loan.model;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	protected Logger logger = Logger
			.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository loanRepository;
	
	@RequestMapping("/loan/{username}")
	public User login(@PathVariable String username) {
		logger.info("user-microservice byusername() invoked: " + username);
		User loan = loanRepository.getLoanByUsername(username);
		logger.info("user-microservice byusername() invoked: " + username);
		
		return loan;
	}
}

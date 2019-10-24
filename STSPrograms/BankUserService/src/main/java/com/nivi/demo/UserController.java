package com.nivi.demo;

import java.util.List;
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
	UserRepository userRepository;
	
	@RequestMapping("/user/{username}")
	public User byUsername(@PathVariable("username") String username) {
		logger.info("user-microservice byusername() invoked: " + username);
		User user = userRepository.getUserByUsername(username);
		logger.info("accounts-microservice byusername() found: " + user);
		return user;
	}
}

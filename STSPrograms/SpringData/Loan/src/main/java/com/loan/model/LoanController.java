package com.loan.model;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@RestController
public class LoanController {

	@Autowired

	LoanRepository dao;

	@RequestMapping(value = "/home")
	public ModelAndView gethomepage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("HomePage");
		return mv;
	}

//	@RequestMapping(value = "/login")
//	public ModelAndView LoginPage(Login log) {
//		ModelAndView mv = new ModelAndView();
//		String x = log.getUsername();
//		String y = log.getPassword();
////String a = dao.findById("username");
//		mv.addObject("nivi", y);
//		mv.addObject("Jey", x);
//		mv.setViewName("demo");
//		return mv;
//	}

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login");
		return mv;

	}
	
	
	
	
	@RequestMapping("/login/{username}")
	public Login byUsername(@PathVariable("username") String username) {
		
		Login login = LoanRepository.
		return login;
	}
}
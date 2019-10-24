package com.nisha.demo;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {
	protected Logger logger = Logger
			.getLogger(AccountController.class.getName());
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/account/{userid}")
	public List<Account> byUserid(@PathVariable("userid") Integer userid) {
		logger.info("account-microservice byuserid() invoked: " + userid);
		List<Account> accList = accountService.getAccountByuserid(userid);
		logger.info("account-microservice byuserid() found: " + userid);
		return accList;
	}
	@RequestMapping(value="/addaccount",method=RequestMethod.POST)
	public void addUserAccount(@RequestBody Account account) {
		accountService.addAccount(account);
	}
	@RequestMapping(value="/getaccount/{accountnum}",method=RequestMethod.GET)
	public Account getUserAccount(@PathVariable Integer accountnum) {
		return accountService.getAccount(accountnum);
	}
	@RequestMapping(value="/deleteaccount/{accountnum}",method=RequestMethod.POST)
	public void deleteUserAccount(@PathVariable Integer accountnum) {
		accountService.deleteAccount(accountnum);
	}
	@RequestMapping(value="/getaccountbyid/{userid}",method=RequestMethod.GET)
	public Account getUserAccountByuserid(@PathVariable Integer accId) {
		return accountService.getAccount(accId);
	}

}

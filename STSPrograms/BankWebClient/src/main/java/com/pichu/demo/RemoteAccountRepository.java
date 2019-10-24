package com.pichu.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;



public class RemoteAccountRepository implements AccountRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	@Override
	public Account getUserAccount(Integer accountnum) {
		return restTemplate.getForObject(serviceUrl + "/getaccount/{accountnum}",
				Account.class, accountnum);
	}
	
	@Override
	public Account addUserAccount(Account account){
		return restTemplate.getForObject(serviceUrl+"/addaccount", Account.class,account);
		
	}

	@Override
	public Account deleteUserAccount(Integer accountnum){
		return restTemplate.getForObject(serviceUrl+"/deleteaccount/{accountnum}", Account.class,accountnum);
		
	}
	@Override
	public Account getAccountByuserid(Integer userid) {
		return restTemplate.getForObject(serviceUrl + "/getaccountbyid/{userid}",
				Account.class, userid);
	}
}

	

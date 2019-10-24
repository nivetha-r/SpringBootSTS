package com.nisha.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public void addAccount(Account account) {
		accountRepository.save(account);
	}


	@Override
	public Account getAccount(Integer accountnum) {
		return accountRepository.findById(accountnum).get();
	}




	@Override
	public String deleteAccount(Integer accountnum) {
		accountRepository.deleteById(accountnum);
		return "deleted";
		
	}


	@Override
	public List<Account> getAccountByuserid(Integer userid) {
		
		return accountRepository.getAccountByuserid(userid);
	}


	


}

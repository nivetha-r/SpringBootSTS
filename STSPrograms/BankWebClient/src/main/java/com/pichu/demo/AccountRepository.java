package com.pichu.demo;

public interface AccountRepository {
	
	public Account getUserAccount(Integer accountnum);
	
    public Account addUserAccount(Account account);

	public Account deleteUserAccount(Integer accountnum);

	public Account getAccountByuserid(Integer userid);

	


}

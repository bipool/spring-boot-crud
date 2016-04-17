package com.bipool.services.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bipool.controller.account.Account;
import com.bipool.controller.account.AccountController;


@RestController
@RequestMapping("/account")
public class AccountService {

	@Autowired
	private AccountController accountController;
	
	@RequestMapping(value="/create",  method=RequestMethod.POST)
	public Account createAccount(@RequestBody Account account){
		return accountController.createAccount(account);
	
	}
	
	@RequestMapping(value="/find/{accountId}", method=RequestMethod.GET)
	public Account getAccountById(@PathVariable Integer accountId){
		Long id = new Long(accountId);
		return accountController.getAccountById(id);
	}
	
	@RequestMapping(value="/delete/{accountId}", method=RequestMethod.DELETE)
	public Boolean deleteAccountById(@PathVariable Integer accountId){
		Long id = new Long(accountId);
		return accountController.deleteAccountById(id);
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Account> getAccountById(){
		return accountController.getAll();
	}
	
}

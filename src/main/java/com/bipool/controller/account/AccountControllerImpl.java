package com.bipool.controller.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bipool.model.AccountEntity;
import com.bipool.model.AccountEntityDao;



@Component
public class AccountControllerImpl  implements AccountController {

	@Autowired
	private AccountEntityDao accountDao;
	
	public Account createAccount(Account account){
		System.out.println(account);
		
		AccountEntity entity = AccountHelper.translate(account);
		accountDao.save(entity);
		account.setId(entity.getId());
		return account;
	}
	
	
	
	public Account getAccountById(Long accountId){
		
		AccountEntity entity = accountDao.findOne(accountId);
		Account account = AccountHelper.translate(entity);
		return account;
	}
	
	
	public Boolean deleteAccountById(Long accountId){
		accountDao.delete(accountDao.findOne(accountId));
		return true;
	}
	
	public List<Account> getAll(){
		List<Account> accountList = new ArrayList<>();
		Iterable<AccountEntity> entityList = accountDao.findAll();
		for(AccountEntity entity: entityList){
			accountList.add(AccountHelper.translate(entity));
		}
		return accountList;
		
	}
	
}

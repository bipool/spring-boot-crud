package com.bipool.controller.account;

import com.bipool.model.AccountEntity;

public class AccountHelper {

	public static Account translate(AccountEntity entity){
		
		Account account = new Account();
		account.setId(entity.getId());
		account.setName(entity.getName());
		account.setType(entity.getType());
		account.setContact(entity.getContact());
		return account;
		
	}
	
	public static AccountEntity translate(Account account){
		
		AccountEntity entity = new AccountEntity();
		entity.setName(account.getName());
		entity.setType(account.getType());
		entity.setContact(account.getContact());
		return entity;
		
	}
	
}

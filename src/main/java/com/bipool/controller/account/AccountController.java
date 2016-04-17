package com.bipool.controller.account;

import java.util.List;

public interface AccountController {
	Account createAccount(Account account);
	Account getAccountById(Long accountId);
	List<Account> getAll();
	Boolean deleteAccountById(Long accountId);
}

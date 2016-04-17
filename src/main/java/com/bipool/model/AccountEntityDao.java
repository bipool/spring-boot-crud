package com.bipool.model;

import org.springframework.data.repository.CrudRepository;

public interface AccountEntityDao extends CrudRepository<AccountEntity, Long> {

	  public AccountEntity findByName(String name);

	}
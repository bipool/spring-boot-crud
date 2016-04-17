package com.bipool.controller.account;

public class Account{

	private Long id;
	private String name;
	private Integer type;
	private String contact;
	
	
	public Account(){
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type + ", contact=" + contact + "]";
	}
	
	
	
	
}

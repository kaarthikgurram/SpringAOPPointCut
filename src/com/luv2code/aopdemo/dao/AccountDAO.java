package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println(getClass() + ":DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void addOneMoreAccount() {
		System.out.println("Adding one more method on same aspect");
	}
}
 
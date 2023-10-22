package com.sy;

import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account {

	@Override
	public void withdraw() 
	{
		System.out.println("withdraw from savingaccount");
	}

	@Override
	public void deposite() 
	{
		System.out.println("deposite from savingaccount");
	}

}

package com.sy;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account {

	@Override
	public void withdraw() 
	{
		System.out.println("withdraw from current account");
	}

	@Override
	public void deposite() 
	{
		System.out.println("deposite to current account");
	}

}

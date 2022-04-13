package com.bankSystem.Intefaces;

import com.bankSystem.Entity.Account;

public interface IAccount {
	
	public void depositBalance(Account acc, double balance);
	public void withdrawBalance(Account acc, double balance);
}

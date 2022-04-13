package com.bankSystem.Repository;

import com.bankSystem.Entity.Account;
import com.bankSystem.Intefaces.IAccount;

public class AccountRepository implements IAccount {
	
	DatabaseConnection conn;
	
	public AccountRepository() {
		conn = new DatabaseConnection();
	}
	
	@Override
	public void depositBalance(Account acc, double balance) {
		balance = acc.getBalance() + balance;
		acc.setBalance(balance);
		
		System.out.println("Deposit: " + balance + " Tk\nCurrent balance: " + acc.getBalance());
	}
	
	@Override
	public void withdrawBalance(Account acc, double balance) {
		if(acc.getBalance() >= balance) {
			balance = acc.getBalance() - balance;		
			acc.setBalance(balance);
			
			System.out.println("Withdrawal: "+ balance +" Tk\nCurrent balance: " + acc.getBalance());
		} else {
			System.out.println("Balance is insufficient.\nCurrent balance: " + acc.getBalance());
		}
	} 
	
	public void insertIntoDatabase(Account acc) {
		String sql = "INSERT INTO public.account ()";
		
		
	}
	
}

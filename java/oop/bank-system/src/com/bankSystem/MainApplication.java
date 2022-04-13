package com.bankSystem;

import java.util.Scanner;

import com.bankSystem.Entity.Account;
import com.bankSystem.Entity.User;
import com.bankSystem.Repository.AccountRepository;
import com.bankSystem.Repository.DatabaseConnection;
import com.bankSystem.Repository.UserRepository;

public class MainApplication {
	
	private void exitSystem() {
		System.exit(0);
	}
	
	private void createAccount() {	
		User user = new User();
		Account account = new Account();
		AccountRepository accRepo = new AccountRepository();
		UserRepository userRepo = new UserRepository();
		
		Scanner userInput = new Scanner(System.in);
		
		try {
			System.out.print("Name: ");
			user.setName(userInput.nextLine());			
			System.out.print("Age: ");
			user.setAge(Integer.parseInt(userInput.nextLine()));
			System.out.print("Gender (Male/Female): ");
			user.setGender(userInput.nextLine());
			System.out.print("NID Number: ");
			user.setNidNumber(Integer.parseInt(userInput.nextLine()));
			System.out.print("Phone: ");
			user.setPhone(userInput.nextLine());
			System.out.print("Password: ");
			user.setPassword(userInput.nextLine());
			
			account.setAccNumber(1111111);
			account.setBalance(0);
			
			userRepo.insertIntoDatabase(user);
			System.out.println(userRepo.getUserId(user.getPhone()));
			// accRepo.insertIntoDatabase(account);
				
			
		} catch (Exception e) {
			userInput.close();
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MainApplication mainObj = new MainApplication();
		String option = "";
		
		System.out.println(""
					+ "----------------------\n"
					+ "Welcome to Bank System\n"
					+ "----------------------\n"
				);
		
		System.out.println(""
					+ "1 Create Account\n"
					+ "2 Deposit Balance\n"
					+ "3 Withdraw Balance\n"
					+ "4 Balance Enquiry\n"
					+ "5 Account Info\n"
					+ "6 Exit\n"
				);
		
		DatabaseConnection dbConn = new DatabaseConnection();
		
		dbConn.openConnection();
		
		Scanner input = new Scanner(System.in);		
		
		try {	
			// while(option != "exit") {
				
				System.out.print("Choose your option: ");
				option = input.next();
				
				switch (option) {
					case "1":
						mainObj.createAccount();
						break;
						
					case "2":
						break;
						
					case "3":
						break;
						
					case "4":
						break;
						
					case "5":
						mainObj.exitSystem();
						break;
			
					default:
						// if (option.equals("exit")) { break; }
						
						System.out.println("Please choose correct option.");
						break;
				}
			// } // end of while loop
			
		} catch (Exception e) {
			System.out.println("Please enter correct numeric value => " + e.getMessage());
		}
		
		input.close();
	}

}

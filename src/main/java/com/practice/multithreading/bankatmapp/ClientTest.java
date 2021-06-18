package com.practice.multithreading.bankatmapp;

public class ClientTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		Thread t1 = new Thread(accountHolder);
		Thread t2 = new Thread(accountHolder);
		t1.setName("Ravi");
		t2.setName("Rupa");
		
		t1.start();
		t2.start();
	}
}

/*
Jack is going to withdraw $2000
Jack completes the withdrawal of $2000
Jack is going to withdraw $2000
Jack completes the withdrawal of $2000
Jack is going to withdraw $2000
Jack completes the withdrawal of $2000
Not enough in account for Jack to withdraw 0
Not enough in account for Joya to withdraw 0
Not enough in account for Joya to withdraw 0
Not enough in account for Joya to withdraw 0
Not enough in account for Joya to withdraw 0
 */
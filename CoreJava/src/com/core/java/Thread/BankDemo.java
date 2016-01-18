package com.core.java.Thread;

class Account {
	private int balance = 0;

	synchronized void deposit(int amount) {
		balance += amount;
	}

	int getBalance() {
		return balance;
	}
}

class Customer extends Thread {
	Account account;

	Customer(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10000; i++)
			account.deposit(10);
	}
}

class BankDemo {
	private final static int NUMCUSTOMERS = 10;

	public static void main(String args[]) {
		Account account = new Account();
		Customer customer[] = new Customer[NUMCUSTOMERS];
		for (int i = 0; i < NUMCUSTOMERS; i++) {
			customer[i] = new Customer(account);
			customer[i].start();
			/*try { // main thread to wait for all child threads completion of
					// execution
				customer[i].join();
			} catch (InterruptedException e) {
			}*/
			System.out.println(account.getBalance());
		}

	}
}
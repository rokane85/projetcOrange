/**
 * 
 */
package dev;

import model.Account;
import model.Transaction;

/**
 * 5 Jun 2016
 */
public class Main {
	
	public static void main(String[] args){
		Account account = new Account();
		account.setAccountBalance(100);
		account.addTransaction(new Transaction(20));
		System.out.println(account.getAccountBalance());
		account.addTransaction(new Transaction(156));
		System.out.println(account.getAccountBalance());
	}
	


}

/**
 * 
 */
package dev;

import java.util.Collection;

import model.Account;
import model.Transaction;

/**
 * 5 Jun 2016
 */
public class Main {	
	
	public static void main(String[] args){
		
	
		
	}
	
	public void printTransactions(Collection<Transaction> trans){
		Account account = new Account();
		account.setAccountBalanceSnapshot(10);
		for(Transaction t : trans){
			System.out.println(t.getTransactionComment());
		}
		
		
	}
	
	
	
	
	


}

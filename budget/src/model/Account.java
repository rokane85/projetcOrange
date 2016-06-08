/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 5 Jun 2016
 */
public class Account {
	/*
	 * ******************** STATIC AND FINAL VARS ********************
	*/
		
	/*
	 * ******************** INSTANCE VARS ********************
	*/
	
	/**
	 * Unique ID associated with the account.
	 */
	private String accountID;
	
	/**
	 * The account name given by the user.
	 */
	private String accountName;
	
	/**
	 * The account description given by the user.
	 */
	private String accountDescription;
	
	/**
	 * A balance snapshot. Create periodically to prevent a lot of 
	 * balance calculations.
	 */
	private int accountBalanceSnapshot;
	
	/**
	 * The set of transactions which occur related to this account.
	 */
	private Collection<Transaction> transactionColleciton;
	
	/*
	 * ******************** CONSTRUCTORS ********************
	*/
	
	/**
	 * Default Constructor
	 */
	public Account(){
		transactionColleciton = new ArrayList<>();
		
	}
	
	/*
	 * ******************** SETTERS AND GETTERS ********************
	*/

	/**
	 * @return the accountID
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the accountDescription
	 */
	public String getAccountDescription() {
		return accountDescription;
	}

	/**
	 * @param accountDescription the accountDescription to set
	 */
	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	/**
	 * @return the accountBalanceSnapshot
	 */
	public int getAccountBalanceSnapshot() {
		return accountBalanceSnapshot;
	}

	/**
	 * @param accountBalanceSnapshot the accountBalanceSnapshot to set
	 */
	public void setAccountBalanceSnapshot(int accountBalanceSnapshot) {
		this.accountBalanceSnapshot = accountBalanceSnapshot;
	}

	/**
	 * @return the transactionColleciton
	 */
	public Collection<Transaction> getTransactionColleciton() {
		return transactionColleciton;
	}

	/**
	 * @param transactionColleciton the transactionColleciton to set
	 */
	public void setTransactionColleciton(Collection<Transaction> transactionColleciton) {
		this.transactionColleciton = transactionColleciton;
	}
	
	/*
	 * ******************** CLASS METHODS ********************
	*/
	
	/**
	 * Add the transaction to the list of transactions for the account.
	 * @param transaction
	 */
	public void addTransaction(Transaction transaction){
		transactionColleciton.add(transaction);
		//
	}
	
	/**
	 * Remove the transaction from the list of transactions for the account.
	 * @param transaction
	 */
	public void removeTransaction(Transaction transaction){
		transactionColleciton.remove(transaction);		
	}
	
	

}

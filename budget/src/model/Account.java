/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 5 Jun 2016
 */
public abstract class Account {
	/*
	 * ******************** STATIC AND FINAL VARS ********************
	*/
	
	

	/*
	 * ******************** INSTANCE VARS ********************
	*/
	/**
	 * The unique ID of the account.
	 */
	private String accountID;
	
	/**
	 * Name of the Account
	 */
	private String accountName;
	
	/**
	 * Description of the account.
	 */
	private String accountDescription;
	
	/**
	 * Account balance. Use smallest denomination of currency.
	 * IE use pennies for GB, or cents for US.
	 */
	private int accountBalance;
	
	private List<Transaction> transactionList;
	
	/*
	 * ******************** CONSTRUCTORS ********************
	*/

	public Account(){
		transactionList = new ArrayList<>();
	}
	
	/*
	 * ******************** SETTERS AND GETTERS ********************
	*/

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
	 * @return the accountBalance
	 */
	public int getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Transaction> getTransactionList(){
		return this.transactionList;
	}
	
	public void setTransactionList(List<Transaction> transactionList){
		this.transactionList = transactionList;
	}
	
	/*
	 * ******************** CLASS METHODS ********************
	*/
	
	public void deposit(int amount){
		setAccountBalance(getAccountBalance() + amount);		
	}
	
	public void deposit(double amount){
		setAccountBalance(getAccountBalance() + (int)(amount * 100));
	}
	
	public void withdraw(int amount){
		setAccountBalance(getAccountBalance() - amount);
	}
	
	public void addTransaction(Transaction transaction){
		transactionList.add(transaction);
		this.updateBalance();
	}
	
	private void updateBalance(){
		int accountTotal = this.getAccountBalance();
		for(Transaction transaction : this.transactionList){
			accountTotal += transaction.getTransactionAmount();			
		}
		this.setAccountBalance(accountTotal);
	}

}

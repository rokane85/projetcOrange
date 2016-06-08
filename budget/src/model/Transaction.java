/**
 * 
 */
package model;

import java.time.LocalDate;

/**
 * 5 Jun 2016
 */
public class Transaction {
	/*
	 * ******************** STATIC AND FINAL VARS ********************
	*/
	
	/*
	 * ******************** INSTANCE VARS ********************
	*/
	
	/**
	 * Unique ID of the transaction.
	 */
	private String transactionID;
	
	/**
	 * ENum denoting the type of transaction.
	 * i.e Deposit/Withdrawal/Transfer etc
	 */
	private TransactionType transactionType;
	
	/**
	 * The date when the transaction takes place.
	 */
	private LocalDate transactionDate;
	
	/**
	 * The value of the transaction.
	 */
	private int transactionAmount;
	
	/**
	 * Description of the transaction.
	 */
	private String transactionComment;
	
	/*
	 * ******************** CONSTRUCTORS ********************
	*/
	
	/**
	 * Default Constructor
	 */
	public Transaction(){
		
	}

	/*
	 * ******************** SETTERS AND GETTERS ********************
	*/
	
	/**
	 * 
	 * @return
	 */
	public String getTransactionID() {
		return transactionID;
	}

	/**
	 * 
	 * @param transactionID
	 */
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * 
	 * @return
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * 
	 * @param transactionType
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * 
	 * @return
	 */
	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	/**
	 * 
	 * @param transactionDate
	 */
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * 
	 * @return
	 */
	public int getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * 
	 * @param transactionAmount
	 */
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	/**
	 * 
	 * @return
	 */
	public String getTransactionComment() {
		return transactionComment;
	}

	/**
	 * 
	 * @param transactionComment
	 */
	public void setTransactionComment(String transactionComment) {
		this.transactionComment = transactionComment;
	}	
	
	/*
	 * ******************** CLASS METHODS ********************
	*/

}

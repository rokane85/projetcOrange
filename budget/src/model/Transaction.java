/**
 * 
 */
package model;

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

	private int transactionAmount;
	
	/*
	 * ******************** CONSTRUCTORS ********************
	*/

	public Transaction(){
		
	}
	
	public Transaction(int transactionAmount){
		setTransactionAmount(transactionAmount);
	}
	/*
	 * ******************** SETTERS AND GETTERS ********************
	*/

	/**
	 * @return the transactionAmount
	 */
	public int getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	
	
	/*
	 * ******************** CLASS METHODS ********************
	*/

}

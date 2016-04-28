package money;

/**
 * Controls the input of coins into the jukebox.
 */
public class CoinInput {
	/** How many coins are currently in the machine */
	private int funds;
	
	/** How many coins have been input over the machine's lifetime */
	private int totalInput;
	
	/**
	 * Initializes all fields with no coins inserted yet.
	 */
	public CoinInput(){
		funds = 0;
		totalInput = 0;
	}
	
	/**
	 * Get the number of coins currently in the machine.
	 * 
	 * @return the number of coins currently in the machine
	 */
	public int getFunds(){
		return funds;
	}
	
	/**
	 * Get the number of coins that have ever been put in the jukebox.
	 * 
	 * @return the number of coins that have ever been put in the jukebox
	 */
	public int getTotalFunds(){
		return totalInput;
	}
	
	/**
	 * Inserts a coin into the jukebox.
	 */
	public void insertCoin(){
		funds++;
		totalInput++;
	}
	
	/**
	 * Resets the number of coins in the machine to zero.
	 */
	public void empty(){
		funds = 0;
	}
}

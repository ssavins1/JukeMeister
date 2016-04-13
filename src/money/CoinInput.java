package money;

public class CoinInput {
	/** How many coins are currently in the machine */
	private int funds;
	
	/** How many coins have been input over the machine's lifetime */
	private int totalInput;
	
	public CoinInput(){
		funds = 0;
		totalInput = 0;
	}
	
	public int getFunds(){
		return funds;
	}
	
	public int getTotalFunds(){
		return totalInput;
	}
	
	public void insertCoin(){
		funds++;
		totalInput++;
	}
	
	public void empty(){
		funds = 0;
	}
}

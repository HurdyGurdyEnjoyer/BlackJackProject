/**
 * Creates a player with firstname lastname, deposit amount, and an empty hand.
 */

/**
 * @author maloneb97994
 *
 */

import java.util.ArrayList;

public class player {
	String FirstName;
	String LastName;
	private ArrayList<singleCard> hand = new ArrayList<>();
	
	
	double deposit = 0.0d;
	/**
	 * @param firstName
	 * @param lastName
	 * @param deposit
	 */
	public player(String firstName, String lastName, double deposit) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.deposit = deposit;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the deposit
	 */
	public double getDeposit() {
		return deposit;
	}
	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	/**
	 * @return the hand
	 */
	public ArrayList<singleCard> getHand() {
		return hand;
	}
	/**
	 * @param hand the hand to set
	 */
	public void setHand(ArrayList<singleCard> hand) {
		this.hand = hand;
	}
	
	//adds a singleCard to the player's hand
	public void addToHand(singleCard newCard)
	{
		hand.add(newCard); 
	}
	
	public void clearHand()
	{
		hand.clear();
	}
	
	//returns the face value of every card in hand
	public int getHandValue()
	{//getHandValue method start
		
		int totalVal = 0;
		
		//getting the face value of every card in hand
		for(singleCard curCard : hand)
		{
			totalVal = curCard.getNumericValue();
		}
		return totalVal;
	}//getHandValue method end
	
	//returns maximum possible point value in hand
	public int getMaxValue()
	{//getMaxValue method start
		int maxVal = 0;
		
		for(singleCard curCard : hand)
		{
			//if the curCard is an ace, set it's value to 10
			if(curCard.getFaceValue() == 1)
			{
				maxVal += 11;
			}
			else
				maxVal = curCard.getNumericValue();
		}
		return maxVal;
	}//getMaxValue method end
	
	@Override
	public String toString() {
		return "_player [FirstName=" + FirstName + ", LastName=" + LastName + ", deposit=" + deposit + "]";
	}
	
	
	
	
	
	
}

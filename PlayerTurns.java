/*
 * Gavin Cummings
 * 03/30/2024
 * The purpose of this class is to define the actions a player can take during a turn. This class is meant
 * to be called from a driver class of some kind
 */

package BlackJackTurns;

class PlayerTurn 
{//PlayerTurn class start
	
	//Stuff to do during a turn
	/*
	 * placing bet
	 * hit (take as many cards as want until over 21)
	 * Stay (do nothing and end turn)
	 */
	
	
	
	public int placeBet(/*betAmount*/)
	{//placeBet method start
		try
		{
			//check if the betted amount is less than or equal to the total amount of money available  
			//if ((betAmount + listOfPlayers.get(playerID).getBet) < listOfPlayers.get(playerID).getMoney)
			{
				//listOfPlayers.get(playerID).setBet(betAmount + listOfPlayers.get(playerID).getBet);
				//listOfPlayers.get(playerID).setFunds(betAmount);
				return 0;
			}
			//else
			//{
				//return -2; //return overdraft from funds
		    //}
		}catch (Exception e)
		{
			return -1;//return error
		}
		
	}//placeBet method end
	
	public int playerHit(/*int playerID*/)
	{//playerHit method start
		try
		{
			//get a card from the dealer, add that card to the player's hand and add that card's points to the player's point total
			//cardID = dealer.drawCard();
			//listOfPlayers.get(playerID).addHand(cardID);
			//listOfPlayers.get(playerID).addPoints(Deck.cards.getRank(cardID));
			return 0; //no error
		}catch (Exception e)
		{
			return -1; //return error
		}
	}//playerHit method end
	
}//PlayerTurn class end

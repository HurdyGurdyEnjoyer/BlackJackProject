/*
 * Gavin Cummings
 * 03/30/2024
 * The purpose of this class is to define the actions a player can take during a turn. This class is meant
 * to be called from a driver class of some kind
 */

class PlayerTurn 
{//PlayerTurn class start
	
	//Stuff to do during a turn || will also need to grab the player array from the game class
	/*
	 * placing bet
	 * hit (take as many cards as want until over 21)
	 * double 
	 * surrender
	 * Stay (do nothing and end turn)
	 * (maybe) split
	 */
	
	//loop through an individual player's turn to hit, stay, double, surrender, or split. 
	
	public void handleTurn()
	{//handleTurn method start
		
		//variables
		int selection;
		String optTable = "1) Hit\n2) Double\n3) Split\n4) Stay\n5) Surrender";
		
		do
		{
			//Prompting for, getting, and parsing user input
			System.out.print("please choose between 1-5\n" + 
					optTable +
					">>> ");
			selection = Integer.parseInt(keyIn.nextLine());
			
			switch(selection)
			{
			case 1:
				playerHit();
			break;
			case 2:
				playerDouble();
			break;
			case 3:
				//Split
			break;
			case 5:
				playerSurrender();
			break;
			default:
				//stay
			}
				
			
			
			
			
		} while(!(selection == 2 || selection == 4 || selection == 5));
		
	}//handleTurn method end
	
	public void placeBet(double betAmount)
	{//placeBet method start
		
		listOfPlayers.get(playerID).setBet(betAmount + listOfPlayers.get(playerID).getBettedAmount);
		listOfPlayers.get(playerID).withdrawBalance(betAmount);
		
	}//placeBet method end
	
	public void playerHit(/*int playerID*/)
	{//playerHit method start
	
		//get a card from the dealer, add that card to the player's hand and add that card's points to the player's point total

		String cardRank, cardSuit;
		//draw card from dealer
		
		listOfPlayers.get(playerID).addToHand(cardRank, cardSuit);
		
	}//playerHit method end
	
	public void playerDouble()
	{//playerDouble method start
		
		String cardRank, cardSuit;
		double betAmount = listOfPlayers.get(playerID).getBettedAmount()
		//draw card from dealer
		
		//adding card to player's hand
		listOfPlayers.get(playerID).addToHand(cardRank, cardSuit);
		
		//withdrawing money from player balance and doubling their bet
		listOfPlayers.get(playerID).withdrawBalance(betAmount);
		listOfPlayers.get(playerID).addBettedAmount(betAmount);
		
	}//playerDouble method end
	
	public void playerSplit()
	{//playerSplit method start
		
		//create a second player that is linked to the original player
		//this "player"'s betted amount is equal to the inital amount betted
		
	}//playerSplit method end
	
	public void playerSurrender()
	{//playerSurrender method start
		Player curPlayer = new listOfPlayers.get(playerID);
		double halfBet = (curPlayer.getBettedAmount() / 2);
		
		//halving bet and adding funds to balance
		curPlayer.setBettedAmount(halfBet);
		curPlayer.setBalance(curPlayer.getBalance() + halfBet);
		
		//clearing whole hand and deleting hand size
		curPlayer.clearHand();
		
	}//playerSurrender method end
}//PlayerTurn class end

/**
 * 
 */

/**
 * @author maloneb97994
 *
 */
public class blackjackRound {
	// 
	Players playing = new Players();  
	deck cardsforRound = new deck();

	
	
	
	/**
	 * @param playing
	 */
	public blackjackRound(Players playing) {
		super();
		this.playing = playing;
	}

	private void round()
	{
		cardsforRound.shuffle();
		//player bet
		//disrupt cards to Players(...).singleCard
		// Loop for Players turn.
		// if last player use deal turn
			// use dealer rules
		
	}
	
	// fx take card and provide to each player
	
	// double  - minor
	// stand
	
	// hit
	public void PT_Hit(player curPlayer)
	{//PT_Hit method start
		
		//creating a card
		Card newCard = cardsforRound.nextCard();
		
		//create an instance of singleCard
		singleCard newHit = new singleCard(newCard.getSuiteDesignator(), newCard.getValue());
		
		//add the single card to a hand. either on the table or on the player. 
		curPlayer.addToHand(newHit);
		
	}//PT_Hit method end
	
	// split  - minor
	// surround  - minor
	
	
	
	//Determine Outcome
	
}

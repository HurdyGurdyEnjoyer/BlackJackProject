import java.util.ArrayList;


public class Hand <T extends Card> {
	protected ArrayList<T> cards = new ArrayList<T>(); // ArrayList to hold cards of type T
	
	// Method to calculate the score of the hand
	public int score() {
		int score = 0; // Initialize score to 0
		for (T card : cards) { // Iterate through each card in the hand
			score += card.value(); // Add the value of the card to the total score
		}
		return score; // Return the total score of the hand
	}
	
	// Method to add a card to the hand
	public void addCard(T card) {
		cards.add(card); // Add the card to the list of cards in the hand
	}	
	
	// Method to print the cards in the hand
	public void print() {
		for (Card card : cards) { // Iterate through each card in the hand
			card.print(); // Print the card
		}
	}	
}

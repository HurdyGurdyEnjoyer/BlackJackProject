import java.util.ArrayList;


public class BlackjackHand extends Hand<BlackjackCard> {

	// Constructor for BlackjackHand class
	public BlackjackHand() {
		// Empty constructor body
	}
	
	// Method to calculate the score of the hand
	public int score() {
		// Get all possible scores for the hand
		ArrayList<Integer> scores = possibleScores();
		int maxUnder = Integer.MIN_VALUE; // Initialize maxUnder to the minimum possible integer value
		int minOver = Integer.MAX_VALUE; // Initialize minOver to the maximum possible integer value
		// Loop through each score in the list of possible scores
		for (int score : scores) {
			// Update minOver if the score is over 21 but less than the current minOver
			if (score > 21 && score < minOver) {
				minOver = score;
			} 
			// Update maxUnder if the score is less than or equal to 21 but greater than the current maxUnder
			else if (score <= 21 && score > maxUnder) {
				maxUnder = score;
			}
		}
		// Return the maximum valid score that is not over 21, or if all scores are over 21, return the minimum over 21
		return maxUnder == Integer.MIN_VALUE ? minOver : maxUnder;
	}
	
	// Method to calculate all possible scores for the hand
	private ArrayList<Integer> possibleScores() {
		ArrayList<Integer> scores = new ArrayList<Integer>(); // Initialize an ArrayList to store possible scores
		if (cards.size() == 0) { // If there are no cards in the hand
			return scores; // Return an empty list of scores
		}
		// Iterate through each card in the hand and calculate scores
		for (BlackjackCard card : cards) {
			addCardToScoreList(card, scores); // Add the current card to the list of scores
		}
		return scores; // Return the list of possible scores
	}
	
	// Method to add a card to the list of possible scores
	private void addCardToScoreList(BlackjackCard card, ArrayList<Integer> scores) {
		if (scores.size() == 0) { // If there are no scores in the list yet
			scores.add(0); // Add a score of 0 to the list
		} 
		int length = scores.size(); // Get the current length of the scores list
		// Iterate through each score in the list
		for (int i = 0; i < length; i++) {
			int score = scores.get(i); // Get the score at index i
			scores.set(i, score + card.minValue()); // Add the minimum value of the card to the current score
			// If the card has different min and max values, add the max value to the score list as well
			if (card.minValue() != card.maxValue()) {
				scores.add(score + card.maxValue());
			}
		}
	}
	
	// Method to check if the hand is busted (score over 21)
	public boolean busted() {
		return score() > 21; // Return true if the score is greater than 21, false otherwise
	}
	
	// Method to check if the hand is exactly 21
	public boolean is21() {
		return score() == 21; // Return true if the score is exactly 21, false otherwise
	}
	
	// Method to check if the hand is a blackjack (Ace + 10-value card)
	public boolean isBlackjack() {
		if (cards.size() != 2) { // If there are not exactly 2 cards in the hand
			return false; // It cannot be a blackjack, so return false
		}
		BlackjackCard first = cards.get(0); // Get the first card in the hand
		BlackjackCard second = cards.get(1); // Get the second card in the hand
		// Return true if the hand contains an Ace and a 10-value card, regardless of their order
		return (first.isAce() && second.isFaceCard()) || (second.isAce() && first.isFaceCard());
	}
}

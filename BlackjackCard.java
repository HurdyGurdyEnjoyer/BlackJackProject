public class BlackjackCard extends Card {
	
	// Constructor for creating a BlackjackCard object with given value and suit
	public BlackjackCard(int c, Suit s) {
		super(c, s); // Call the constructor of the superclass (Card)
	}
	
	// Method to get the value of the card
	public int value() {
		if (isAce()) { // If the card is an Ace
			return 1; // Ace has a value of 1
		} else if (isFaceCard()) { // If the card is a face card (Jack, Queen, or King)
			return 10; // Face cards have a value of 10
		} else { // Otherwise, it's a number card
			return faceValue; // Return the face value of the card
		}
	}
	
	// Method to get the minimum possible value of the card
	public int minValue() {
		if (isAce()) { // If the card is an Ace
			return 1; // Ace has a minimum value of 1
		} else {
			return value(); // For other cards, minimum value is the same as the value
		}
	}
	
	// Method to get the maximum possible value of the card
	public int maxValue() {
		if (isAce()) { // If the card is an Ace
			return 11; // Ace has a maximum value of 11
		} else {
			return value(); // For other cards, maximum value is the same as the value
		}
	}
	
	// Method to check if the card is an Ace
	public boolean isAce() { 
		return faceValue == 1; // Ace has a face value of 1
	} 
	
	// Method to check if the card is a face card (Jack, Queen, or King)
	public boolean isFaceCard() {
		return faceValue >= 11 && faceValue <= 13; // Face cards have face values between 11 and 13
	}
}


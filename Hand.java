public interface hand
{
	// Method to calculate the total value of the hand
    int Total();
    
    // Method to convert the hand into a string representation
    String toString();

    // Method to convert the hand into a string representation with options to hide cards
    String toString(boolean a, boolean b);
    
    // Method to add a card to the hand
     void addCard(Card card);

     // Method to reset the hand (remove all cards)
     void resetHand();

     // Method to check if the hand contains a natural blackjack (Ace and a 10-value card)
     boolean check();
     
     // Method to get the total number of cards in the hand
     int getTotalCards();
}

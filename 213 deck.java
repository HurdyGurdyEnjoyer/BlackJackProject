/**
 * 
 */
import java.util.Random;

/**
 * @author maloneb97994
 *
 */
public class deck {
    Card[] aDeck = new Card[52];
    private int nextCard;
    
 // Constructor to initialize the deck with all 52 cards
    public deck(){
        int ct = 0;
        try{
        	// Loop to create and add each suit of cards (hearts, spades, clubs, diamonds)
            for (int i = 1; i <= 13; i++) {
            	aDeck[ct++] = new Card('H', i);
            }
            for (int i = 1; i <= 13; i++) {
            	aDeck[ct++] = new Card('S', i);
            }
            for (int i = 1; i <= 13; i++) {
            	aDeck[ct++] = new Card('C', i);
            }
            for (int i = 1; i <= 13; i++) {
            	aDeck[ct++] = new Card('D', i);
            }
        }

        catch(Exception e) {
            System.out.println("Error");
        }
        nextCard = 0;
    }
    
 // Method to convert the deck into a string for display
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (Card card : aDeck) {
            str.append(card.toString()).append(" ");
        }
        return str.toString();
    }

    //swap positions of 2 cards in the deck
    private void swapCards(int card1, int card2) {
        Card temp;
        if(inDeck(card1)&&inDeck(card2))
        {
        temp = aDeck[card1];
        aDeck[card1] = aDeck[card2];
        aDeck[card2] = temp;
        }
    }

    //shuffle the card in the deck
    public void shuffle() {
        Random rn = new Random();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < aDeck.length; j++) {
                swapCards(i, rn.nextInt(52));
            }
        }
        nextCard = 0;
    }

    //check if the card is in the deck or not
    private boolean inDeck(int index)  {
        boolean check;
        if (index < 0 || index > 51) {
            check= false;
        }
        else{
            check= true;
        }
        return check;
    }

    //return the card at the index
    public Card getCard(int index) {
        if(inDeck(index)) {
            return aDeck[index];
        }
        else
        {
            return null;
        }
    }


    // Method to compare this deck with another deck
    public boolean compareTo(deck otherDeck) {
        for (int i=0; i < aDeck.length; i++){
            if (! aDeck[i].compareTo(otherDeck.getCard(i)) ) {
                return false;
            }
        }
        return true;
    }

 // Method to get the next card from the deck
    public Card nextCard() {

        if (nextCard < 0 || nextCard > 51) {
            System.out.println("error");
        }
        return aDeck[nextCard++];
    }


	
	
}

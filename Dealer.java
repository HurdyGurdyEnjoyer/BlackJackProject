//Dealer class 


public class Dealer
{

    private blackJackHand hand = new blackJackHand();

    // Check if dealer got the blackjack condition
    public boolean isBlackjack(){
        if (hand.Total() == 21){
            return true;
        } else {
            return false;
        }
    }

    // This automates the dealer's play
    public void dealerPlay(Deck deck){
        System.out.println();
        while (hand.Total() <= 16) {
            System.out.println("Dealer has " + hand.Total()+ " and hits");
            hand.addCard(deck.nextCard());
            System.out.println("Dealer " + this.getHandString(true, false));
        }
        if ( hand.Total() > 21) {
            System.out.println("Dealer busts. " + this.getHandString(true, false));
        } else {
            System.out.println("Dealer stands. " + this.getHandString(true, false));
        }
    }

    // Adds a card o the dealer's hand
    public void addCard(Card card) {
        hand.addCard(card);

    }

    // Gets the dealer's hand as a string
    public String getHandString(boolean isDealer, boolean hideHoleCard ) {
        String str = "Cards:" + hand.toString(isDealer, hideHoleCard);

        return str;
    }

    // Calculates the dealer's hand total
    public int Total() {
        return hand.Total();
    }

    // Reset the dealer's hand
    public void resetHand() {
        hand.resetHand();
    }

    // Check the dealer's face-down card
    public boolean check() {
        return hand.check();
    }
}

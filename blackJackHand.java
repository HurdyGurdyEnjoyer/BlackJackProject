public class blackJackHand implements hand {

    private Card[] playHand = new Card[12];

    private int totalCards = 0;
    
    public int getTotalCards() {
        return totalCards;
    }

    // Calculates the total of a hand and also decides whether ace is 1 or 11
    public int Total() {
        int total =0;
        boolean ace11 = false;
        for (int i = 0; i < totalCards; i++) {
            int value = playHand[i].getValue();
            if (value > 10) {
                value = 10;
            } else if ( value == 1) {
                ace11 = true;
            }
            total += value;
        }
        if (ace11 && total + 10 <= 21) {
            total += 10;
        }
        return total;
    }


    public String toString(){
        return this.toString(false, false);
    }

 // Method to convert the hand into a string representation with options to hide cards
    public String toString(boolean isDealer, boolean hideHoleCard){
        StringBuilder str = new StringBuilder();
        int total =0;
        boolean ace11 = false;
        String ace = "";
        for (int i = 0; i < totalCards; i++) {
            if ( isDealer && hideHoleCard && i == 0) {
                str = new StringBuilder("Showing");
            } else {
                int value = playHand[i].getValue();
                String valueName;
                if (value > 10) {
                    valueName = playHand[i].cardValue().substring(0, 1);
                } else if ( value == 1 ){
                    valueName = "A";
                } else {
                    valueName = Integer.toString(value);
                }
                str.append(" ").append(valueName).append(playHand[i].getSuiteDesignator());
                if (value > 10) {
                    value = 10;
                } else if ( value == 1) {
                    ace11 = true;
                }
                total += value;
            }
        }
        if (ace11 && total + 10 <= 21) {
            ace = " or "+ (total + 10);
        }
        if ( hideHoleCard) {
            return str.toString();
        } else {
            return str+ " totals "+ total + ace;
        }

    }
    
 // Method to add a card to the hand
    public void addCard(Card card) {
        playHand[totalCards++] = card;
    }
    
 // Method to reset the hand (remove all cards)
    public void resetHand() {
        totalCards = 0;
    }
    
 // Method to check if the hand contains a natural blackjack (Ace and a 10-value card)
    public boolean check() {
        int value = playHand[1].getValue();
        return value == 1 || value >= 10;
    }
}

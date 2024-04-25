//Class that creates cards with value, and suite


public class Card
{

    public char suite;
    public int value;

    // Constructor to initialize the suite and value of the card
    public Card(char suite, int value) {
        this.suite = suite;
        this.value = value;
    }
    
    // Method to convert the card into a string representation
    public String toString() {
        return getSuiteName() + " " + this.value;
    }

    //return what suite the card is
    public String getSuiteName() {
        String suite;
        if (this.suite == 'H') {
            suite = "Hearts";
        }
        else if (this.suite == 'S') {
            suite = "Spades";
        }
        else if (this.suite == 'C') {
            suite = "Clubs";
        }
        else if (this.suite == 'D') {
            suite = "Diamonds";
        } else {
            suite = "Unknown";
        }
        return suite;
    }
    
    // Method to return the designator of the suite of the card
    public char getSuiteDesignator() {
        return suite;
    }
    
    // Method to return the name of the card value
    public String cardValue(){
        String cardStat = " ";
        if (this.value == 1) {
            cardStat = "Ace";
        }
        else if (this.value == 2) {
            cardStat = "Two";
        }
        else if (this.value == 3) {
            cardStat = "Three";
        }
        else if (this.value == 4) {
            cardStat = "Four";
        }
        else if (this.value == 5) {
            cardStat = "Five";
        }
        else if (this.value == 6) {
            cardStat = "Six";
        }
        else if (this.value == 7) {
            cardStat = "Seven";
        }
        else if (this.value == 8) {
            cardStat = "Eight";
        }
        else if (this.value == 9) {
            cardStat = "Nine";
        }
        else if (this.value == 10) {
            cardStat = "Ten";
        }
        else if (this.value == 11) {
            cardStat = "Jack";
        }
        else if (this.value == 12) {
            cardStat = "Queen";
        }
        else if (this.value == 13) {
            cardStat = "King";
        }
        return cardStat;
    }
    
    // Method to return the numerical value of the card
    public int getValue() {
        return this.value;
    }

    //Compare the suites of a card
    public boolean compareSuite(Card card){
        return this.suite == card.getSuiteDesignator();
    }
    
    // Method to compare the values of two cards
    public boolean compareValue(Card card){
        return this.value == card.getValue();
    }
    
    // Method to compare both suite and value of two cards
    public boolean compareTo(Card card){
        return this.suite == card.getSuiteDesignator() && this.value == card.getValue();
    }


}

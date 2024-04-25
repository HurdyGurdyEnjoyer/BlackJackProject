public interface cardGame extends Game {

    //method to shuffle the cards
    void shuffle();
    //method to ask the user what they want to do
    void getUserMove();
    //method to display the card player has
    void displayHand();
    //method to get rid of the current hand
    void discardHand();

}

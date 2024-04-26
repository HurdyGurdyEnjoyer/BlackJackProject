public class player {

    private String playerName;
    private int bet;
    private int money;
    private blackJackHand hand;

    // Constructor function
    public player() {
        money = 100;
        bet = 0;
        hand = new blackJackHand();
    }

    // Tell how much money the player has
    public int getMoney() {
        return money;
    }

    // subtracts the amount from player if they bust
    public void playerBust() {
        money -= bet;
        bet = 0;
    }

    // Adds the amount if they win
    public void playerWin() {
        money += bet;
        bet = 0;
    }

    //Double Bet Win
    public void dubble() {
    	money += bet*2;
    	bet = 0;
    		
    }
    
    //Surrender bet
    public void surrender() {
    	money -= bet/2;
    	bet = 0;
    }
    
    // Remove money if they lose
    public void loss() {
        money -= bet;
        bet = 0;
    }

    // If player no longer wishes to play
    public void removeFromGame() {
        money = -1;
    }

    // Reset the money to 0
    public void resetBank() {
        money = 0;
    }

    // Set blackjack bet condition of 1.5 times the money they bet
    public void blackjackBet() {
        money += bet * 1.5;
        bet = 0;
    }

    // If player pushes this means they are not betting
    public void push() {
        bet = 0;
    }

    // How much the player bets
    public void setBet(int newBet) {
        bet = newBet;
    }

    // Sets a player's name
    public void setName(String name1){
        playerName = name1;
    }

    // Gets a player's name
    public String getName() {
        return playerName;
    }

    // Gets a player's hand total
    public int getTotal() {
        return hand.Total();
    }

    // Gets a player's bet
    public int getBet(){
        return this.bet;
    }

    // Adds a card to a player's hand
    public void addCard(Card card) {
        hand.addCard(card);

    }

    // Tells what cards the player has
    public String getHandString() {
        String str = "Cards:" + hand.toString();
        return str;
    }

    // Resets player hand
    public void resetPlayerHand() {
        hand.resetHand();
    }
    public int getHandSize() {
        return hand.getTotalCards();
    }

}

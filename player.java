
import java.util.ArrayList;
import java.util.List;

public class player {

    private String playerName;
    private int bet;
    private int money;
    private List<blackJackHand> hands;

    // Constructor function
    public player() {
        resetMoney();
        hands = new ArrayList<>();
        hands.add(new blackJackHand());
    }
    
    // Method to get the player's hands
    public List<blackJackHand> getHands() {
        return hands;
    }
    
    // Method to add a hand to the player's hands
    public void addHand(blackJackHand newHand) {
        hands.add(newHand);
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
    
    // sets a player's total amount of money to 100
    public void resetMoney() {
        money = 100;
    }

    // Gets a player's name
    public String getName() {
        return playerName;
    }

    // Gets a player's total for all hands
    public int getTotal() {
        int total = 0;
        for (blackJackHand hand : hands) {
            total += hand.Total();
        }
        return total;
    }

    // Gets a player's bet
    public int getBet(){
        return this.bet;
    }
    
    // Method to adjust the player's balance by a specified amount
    public void adjustBalance(int amount) {
        money += amount;
    }
    
    // Adds a card to a player's hand
    public void addCard(Card card) {
        hands.get(0).addCard(card);
    }

    // Tells what cards the player has
    public String getHandString() {
        StringBuilder str = new StringBuilder();
        for (blackJackHand hand : hands) {
            str.append("Cards: ").append(hand.toString()).append("\n");
        }
        return str.toString();
    }

    // Resets player hands
    public void resetPlayerHand() {
        hands.clear();
    }

    // Gets the total number of cards in all hands
    public int getHandSize() {
        int totalSize = 0;
        for (blackJackHand hand : hands) {
            totalSize += hand.getTotalCards();
        }
        return totalSize;
    }

    // Method to get a card from the player's hand at a specific index
    public Card getCard(int index) {
        return hands.get(0).getCard(index);
    }

    // Method to remove a card from the player's hand at a specific index
    public Card removeCard(int index) {
        return hands.get(0).removeCard(index);
    }
    
    // Method to split the player's hand
    public blackJackHand split() {
        if (hands.get(0).getTotalCards() == 2 && hands.get(0).getCard(0).getValue() == hands.get(0).getCard(1).getValue()) {
            blackJackHand splitHand = new blackJackHand(); // Create a new hand for the split
            Card cardToMove = hands.get(0).removeCard(1); // Remove the second card from the original hand
            splitHand.addCard(cardToMove); // Add the removed card to the split hand
            return splitHand;
        } else {
            return null; // Split not possible
        }
    }
}

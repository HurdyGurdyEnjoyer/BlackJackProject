public class Main {

    public static void main(String[] args) {
	
        // Create an instance of the BlackjackGame
        BlackjackGame bjg = new BlackjackGame();

        
        bjg.startGame();

        // Execute the game loop
        do {
            
            bjg.shuffle();
            
            
            bjg.getBets();
            
            // Deal cards to players and dealer
            bjg.deal();
            
            // Display hands of players and dealer
            bjg.displayHand();
            
            // Check if anyone has Blackjack
            bjg.checkWinningCondition();
            
            // Allow players to make their moves
            bjg.getUserMove();
            
            // Let the dealer play its turn
            bjg.dealerMove();
            
            // Adjust balances based on game outcomes
            bjg.adjustBalance();
            
            // Display updated bank balances of players
            bjg.displayBankBalance();
            
            // Discard hands for next round
            bjg.discardHand();
            
        } while (bjg.nextMatch()); // Continue the loop if players want to play another round
    }
}

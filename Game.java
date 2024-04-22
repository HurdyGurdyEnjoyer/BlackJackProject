public interface Game {
    //method to start the game
    void startGame();
    //method to check if we have a winner or not
    void checkWinningCondition();
    //method to ask if the players want to play more or stop
    boolean nextMatch();
    //force end the game
    boolean endGame();
    //method to exit the game
    void finishMatch();
}

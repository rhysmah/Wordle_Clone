package com.example.wordle_clone;

/**
 * Represents a Wordle Player.
 * @author Mahannah
 * @version 17-12-22
 */
public final class Player {

    /**
     * Max number of turns a player can take.
     */
    public static final int MAX_NUMBER_PLAYER_TURNS = 6;

    private static final String  INITIAL_GUESS_WORD_VALUE  = "";
    private static final int     INITIAL_PLAYER_TURN_VALUE = 0;

    private String guessWord;
    private int    playerTurn;

    /**
     * Creates an object of type Player.
     */
    public Player() {
        this.playerTurn = INITIAL_PLAYER_TURN_VALUE;
        this.guessWord  = INITIAL_GUESS_WORD_VALUE;
    }

    /**
     * Sets the guess word.
     * @param newGuessWord the new word (String)
     */
    public void setGuessWord(final String newGuessWord) {
        this.guessWord = newGuessWord;
    }

    /**
     * Returns user input.
     * @return user word in all uppercase (String).
     */
    public String getGuessWord() {
        return guessWord;
    }

    /**
     * Returns the player's turn value.
     * @return the player's turn (int).
     */
    public int getPlayerTurn() {
        return playerTurn;
    }

    /**
     * Increments the player turn by one.
     */
    public void incrementPlayerTurn() {
        playerTurn++;
    }
}

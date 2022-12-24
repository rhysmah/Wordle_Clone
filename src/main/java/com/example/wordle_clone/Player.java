package com.example.wordle_clone;

/**
 * Represents a Wordle Player.
 * @author Mahannah
 * @version 24-12-22
 */
public final class Player {

    /**
     * Max number of turns a player can take.
     */
    public static final int MAX_NUMBER_PLAYER_TURNS = 6;

    private static final int INITIAL_PLAYER_TURN_VALUE = 0;

    private int playerTurn;

    /**
     * Creates an object of type Player.
     */
    public Player() {
        this.playerTurn = INITIAL_PLAYER_TURN_VALUE;
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

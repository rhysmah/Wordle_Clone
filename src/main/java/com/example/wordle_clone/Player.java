package com.example.wordle_clone;

import java.util.Scanner;

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

    private static final Scanner SCAN = new Scanner(System.in);
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
     * @param guessWord the new word (String)
     */
    public void setGuessWord(final String guessWord) {
        this.guessWord = guessWord;
    }
    /**
     * Returns user input
     * @return user word in all uppercase (String).
     */
    public String getGuessWord() {
        // The below line is for the console version.
        // guessWord = SCAN.next();

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
     * Removes specified letter from word.
     * <p>
     * Word is split into a String array; the specified letter is replaced
     * with a period ("."), then the String is concatenated.
     *
     * @param index the index of the letter to be removed (int).
     */
    public void removeLetterFromGuessWord(final int index) {
        String[] wordLetters = guessWord.split("");
        wordLetters[index] = ".";
        guessWord = String.join("", wordLetters);
    }

    /**
     * Increments the player turn by one.
     */
    public void incrementPlayerTurn() {
        playerTurn++;
    }
}

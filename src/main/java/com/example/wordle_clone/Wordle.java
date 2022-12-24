package com.example.wordle_clone;

import java.util.Arrays;
import java.util.Random;

/**
 * A Wordle clone.
 * @author Mahannah
 * @version 17-12-22
 */
public class Wordle {

    /**
     * Maximum allowable number of letters per word.
     */
    public static final int LETTERS_PER_WORD = 5;

    private static final Random RANDOM_NUMBER_GENERATOR   = new Random();
    private static final String CONTAINS_VALID_CHARACTERS = "^[a-zA-Z]*$";

    private final String    gameWord;
    private final boolean[] winCondition;

    /**
     * Creates an object of type Wordle.
     */
    public Wordle() {
        this.gameWord     = WordList.WORDS[RANDOM_NUMBER_GENERATOR.nextInt(WordList.WORDS.length) - 1];
        this.winCondition = new boolean[LETTERS_PER_WORD];
    }

    /*
     * Checks that a word contains specified letters per word.
     */
    private boolean validLength(final String word) {
        return word.length() == LETTERS_PER_WORD;
    }

    /*
     * Checks that a word contains valid characters.
     */
    private boolean validCharacters(final String word) {
        return word.matches(CONTAINS_VALID_CHARACTERS);
    }

    /*
     * Checks if the userWord is in the word list.
     */
    private boolean validWord(final String word) {
        return Arrays.asList(WordList.WORDS).contains(word);
    }

    /**
     * Checks that word contains exactly five letters and is a valid English word.
     * @param word the word (String) to be validated.
     * @return true if the word is a real five-letter word.
     */
    public boolean validateUserGuess(final String word) {
        return validLength(word) && validCharacters(word) && validWord(word);
    }

    /**
     * Returns the game word.
     * @return game word (String).
     */
    public String getGameWord() {
        return gameWord;
    }

    /**
     * Adds Boolean "true" to the specified index position.
     * @param index the index of the winCondition boolean array (int).
     */
    public void updateWinCondition(final int index) {
        winCondition[index] = true;
    }

    /**
     * Sets all values in the winCondition array to false.
     */
    public void resetWinCondition() {
        Arrays.fill(winCondition, false);
    }

    /**
     * Returns the win condition (a Boolean array).
     * @return a Boolean array.
     */
    public boolean winConditionMet() {
        for (boolean booleanValue : winCondition) {
            if (!booleanValue) {
                return false;
            }
        }
        return true;
    }
}

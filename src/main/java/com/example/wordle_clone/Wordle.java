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
        this.gameWord     = WordList.WORDS[RANDOM_NUMBER_GENERATOR.nextInt(WordList.WORDS.length) - 1].toUpperCase();
        this.winCondition = new boolean[LETTERS_PER_WORD];
    }

    /**
     * Checks that a word contains specified letters per word.
     * @param word the word (String) to be evaluated.
     * @return true if the word contains valid letters per word, else false.
     */
    public boolean validLength(final String word) {
        return word.length() == LETTERS_PER_WORD;
    }

    /**
     * Checks that a word contains valid characters.
     * @param word the word (String) to be evaluated.
     * @return true if the word contains valid characters, else false.
     */
    public boolean validCharacters(final String word) {
        return word.matches(CONTAINS_VALID_CHARACTERS);
    }

    /**
     * Checks if the userWord is in the word list.
     * @param word the user's word (String).
     * @return true if the user's word is in the word list, else false.
     */
    public boolean validWord(final String word) {
        return Arrays.asList(WordList.WORDS).contains(word);
    }

    /**
     * Returns true if the specified letter is located at the specified index position in the word.
     * @param letter the letter to be evaluated (char).
     * @param word the word to be evaluated (String).
     * @param index the letter's index position to be evaluated (int).
     * @return true if the specified letter is located at the specified index position of the word, else false.
     */
    public boolean letterInCorrectPosition(final String letter, final String word, final int index) {
        return letter.equals(word.substring(index, index + 1));
    }

    /**
     * Returns true if the letter is located in the word.
     * @param word the word to be evaluated.
     * @param letter the letter to be evaluated.
     * @return true if the letter is located in the word, else false.
     */
    public boolean letterInIncorrectPosition(final String letter, final String word) {
        return word.contains(letter);
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

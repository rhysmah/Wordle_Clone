package com.example.wordle_clone;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A Wordle clone.
 * @author Mahannah
 * @version 16-12-22
 */
public class Wordle {

    /**
     * Scanner for user input.
     */
    public static final Scanner SCAN = new Scanner(System.in);

    /**
     * Max number of turns a player can take.
     */
    public static final int MAX_NUM_TURNS = 6;

    /**
     * Green background -- correct letter in correct spot.
     */
    public static final String GREEN_BACKGROUND = "\u001B[42m";

    /**
     * Yellow background -- correct letter in incorrect spot.
     */
    public static final String YELLOW_BACKGROUND = "\u001B[43m";

    /**
     * Maximum number of letters per word.
     */
    public static final int LETTERS_PER_WORD = 5;

    private static final Random RANDOM      = new Random();
    private static final String ALL_LETTERS = "^[a-zA-Z]*$";
    private static final String ANSI_RESET  = "\u001B[0m";

    private final String    gameWord;
    private final boolean[] winCondition;

    private String playerGuessWord;
    private int    playerTurn;

    /**
     * Creates an object of type Wordle.
     */
    public Wordle() {

        // Selects a random word from a list of words.
        this.gameWord        = WordList.WORDS[RANDOM.nextInt(WordList.WORDS.length) - 1].toUpperCase();

        // The win condition is met when all elements in the boolean array are true.
        this.winCondition    = new boolean[LETTERS_PER_WORD];

        this.playerTurn      = 0;
        this.playerGuessWord = "";
    }

    /**
     * Checks that a word contains exactly the specified letters-per-word.
     *
     * @param word the word (String).
     * @return true if the user's word contains exactly the specified letters-per-word, else false.
     */
    public boolean validLength(final String word) {
        return word.length() == LETTERS_PER_WORD;
    }

    /**
     * Checks that a word contains the specified characters..
     *
     * @param word the word (String).
     * @return true if the worse contains the specified characters, else false.
     */
    public boolean validCharacters(final String word) {
        return word.matches(ALL_LETTERS);
    }

    /**
     * Checks if the userWord is in the word list.
     *
     * @param word the user's word (String).
     * @return true if the user's word is in the word list, else false.
     */
    public boolean validWord(final String word) {
        return Arrays.asList(WordList.WORDS).contains(word);
    }

    /**
     * Prints these characters: a single space, a letter, then a single space.
     * All three characters have a colored background, defined by an ANSI code.
     *
     * @param letter the letter to be evaluated (char)
     * @param ansiCode the color, as an ANSI code, to use.
     */
    public void printLetterWithBackground(final String letter, final String ansiCode) {
        System.out.print(ansiCode + " " + letter.toUpperCase() + " " + ANSI_RESET);
    }

    /**
     * Prints a single space, a letter, then a single space.
     *
     * @param letter the letter to be evaluated (char).
     */
    public void printLetterWithoutBackground(final String letter) {
        System.out.print(" " + letter.toUpperCase() + " ");
    }

    /**
     * Returns true if the specified letter is located at the specified index position in the word.
     *
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
     *
     * @param word the word to be evaluated.
     * @param letter the letter to be evaluated.
     * @return true if the letter is located in the word, else false.
     */
    public boolean letterInIncorrectPosition(final String letter, final String word) {
        return word.contains(letter);
    }

    /**
     * Asks user to input a word.
     *
     * @return user word in all uppercase (String).
     */
    public String askPlayerForGuessWord() {
        playerGuessWord = SCAN.next();
        return playerGuessWord;
    }

    /**
     * Returns the original game word.
     * @return game word (String).
     */
    public String getGameWord() {
        return gameWord;
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
        String[] wordLetters = playerGuessWord.split("");
        wordLetters[index] = ".";
        playerGuessWord = String.join("", wordLetters);
    }

    /**
     * Adds true to the specific index.
     *
     * @param index the index of the boolean array.
     */
    public void updateWinCondition(final int index) {
        winCondition[index] = true;
    }

    /**
     * Returns the win condition, a Boolean array.
     *
     * @return a Boolean array.
     */
    public boolean winConditionMet() {
        for (boolean e : winCondition) {
            if (!e) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the player turn.
     * @return player turn (int).
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

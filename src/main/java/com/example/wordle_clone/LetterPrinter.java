package com.example.wordle_clone;

/**
 * A LetterPrinter class with static methods.
 * @author Mahannah
 * @version 17/12/22
 */
public final class LetterPrinter {

    /**
     * Green background -- correct letter in correct spot.
     */
    public static final String GREEN_BACKGROUND = "\u001B[42m";

    /**
     * Yellow background -- correct letter in incorrect spot.
     */
    public static final String YELLOW_BACKGROUND = "\u001B[43m";

    /**
     * Resets background to default (no color).
     */
    public static final String BACKGROUND_COLOR_RESET = "\u001B[0m";

    /**
     * The LetterPrinter class contains public static methods only.
     */
    private LetterPrinter() { }

    /**
     * Prints a single space, a letter, then a single space, all with
     * the specified background color.
     *
     * @param letter the letter to be evaluated (char).
     * @param backgroundColor the background color name for the letter (String).
     */
    public static void printLetterWithBackgroundColor(final String letter, final String backgroundColor) {
        System.out.print(backgroundColor + " " + letter.toUpperCase() + " " + BACKGROUND_COLOR_RESET);
    }

    /**
     * Prints a single space, a letter, then a single space.
     *
     * @param letter the letter (char) to be evaluated.
     */
    public static void printLetterWithoutBackgroundColor(final String letter) {
        System.out.print(" " + letter.toUpperCase() + " ");
    }
}

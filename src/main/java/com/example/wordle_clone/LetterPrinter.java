package com.example.wordle_clone;

/**
 * A Printer class with static methods.
 * @author Mahannah
 * @version 17-12-22
 */
public final class LetterPrinter {
    private static final String BACKGROUND_COLOR_RESET = "\u001B[0m";

    /**
     * This class contains public static methods only.
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
        System.out.println(backgroundColor + " " + letter.toUpperCase() + " " + BACKGROUND_COLOR_RESET);
    }

    /**
     * Prints a single space, a letter, then a single space.
     *
     * @param letter the letter to be evaluated (char).
     */
    public static void printLetterWithoutBackgroundColor(final String letter) {
        System.out.print(" " + letter.toUpperCase() + " ");
    }
}

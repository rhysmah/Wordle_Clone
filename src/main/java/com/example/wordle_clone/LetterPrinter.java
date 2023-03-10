package com.example.wordle_clone;

import javafx.scene.control.Label;

/**
 * A LetterPrinter class with static methods.
 * @author Mahannah
 * @version 18-12-22
 */
public final class LetterPrinter {

    /**
     * Grey background -- correct letter in correct spot.
     */
    public static final String GREY = "#DCDCDC;";

    /**
     * Green background -- correct letter in correct spot.
     */
    public static final String GREEN = "#3CB371;";

    /**
     * Yellow background -- correct letter in incorrect spot.
     */
    public static final String YELLOW = "#FFD700;";

    /**
     * The LetterPrinter class contains public static methods only.
     */
    private LetterPrinter() { }

    /**
     * Prints a single space, a letter, then a single space, all with
     * the specified background color.
     *
     * @param label the node whose background color will be changed.
     * @param backgroundColor the background color name (String).
     */
    public static void printLetter(final Label label, final String backgroundColor) {
        label.setStyle("-fx-background-color: " + backgroundColor);
    }
}

package com.example.wordle_clone;

/**
 * Removes letter from a word.
 *
 * @author Mahannah
 * @version 19-12-22
 */
public final class LetterRemover {
    private LetterRemover() { }

    /**
     * Replaces the  letter at the specified index with a period ("."),
     * then creates and returns a new String.
     *
     * @param word the word (String) to be altered.
     * @param index the index (int) of the letter to be altered
     * @return a new String.
     */
    public static String removeLetter(final String word, final int index) {
        String[] wordLetters = word.split("");
        wordLetters[index] = ".";
        return String.join("", wordLetters);
    }
}

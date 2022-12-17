package com.example.wordle_clone;

/**
 * Drives the program.
 * @author Mahannah
 * @version 15-12-2022
 */
public final class Driver {
    private Driver() { }

    /**
     * Drives the program.
     * @param args to be read.
     */
    public static void main(final String[] args) {

        Wordle wordle          = new Wordle();
        String playerGuessWord = "";

        // Game loop
        while (wordle.getPlayerTurn() < Wordle.MAX_NUM_TURNS) {
            boolean invalidUserGuess = true;

            // Check that player enters a valid word.
            while (invalidUserGuess) {
                System.out.print("\nEnter a five-letter word: ");
                playerGuessWord = wordle.askPlayerForGuessWord();

                if (!wordle.validLength(playerGuessWord) || !wordle.validCharacters(playerGuessWord)) {
                    System.out.println("The word must contain five letters.");
                    continue;
                }
                if (!wordle.validWord(playerGuessWord)) {
                    System.out.println("The word must be a real word.");
                    continue;
                }
                invalidUserGuess = false;
            }
            // Compare player word against game word.
            for (int index = 0; index < Wordle.LETTERS_PER_WORD; index++) {

                String[] playerWordLetters = playerGuessWord.toUpperCase().split("");
                String   letter            = playerWordLetters[index];

                if (wordle.letterInCorrectPosition(letter, wordle.getGameWord(), index)) {
                    wordle.printLetterWithBackground(letter, Wordle.GREEN_BACKGROUND);
                    wordle.updateWinCondition(index);
                    wordle.removeLetterFromGuessWord(index);

                } else if (wordle.letterInIncorrectPosition(letter, wordle.getGameWord())) {
                    wordle.printLetterWithBackground(letter, Wordle.YELLOW_BACKGROUND);
                    wordle.removeLetterFromGuessWord(wordle.getGameWord().indexOf(letter));

                } else {
                     wordle.printLetterWithoutBackground(letter);
                     wordle.removeLetterFromGuessWord(index);
                 }
            }
            wordle.incrementPlayerTurn();
            System.out.println("\nYou have " + (Wordle.MAX_NUM_TURNS - wordle.getPlayerTurn()) + " turns remaining.");

            if (wordle.winConditionMet()) {
                System.out.println("\nCongratulations! You won with "
                        + (Wordle.MAX_NUM_TURNS - wordle.getPlayerTurn()) + " turn(s) remaining.");
                System.exit(0);
            }
        }
        System.out.println("You lost! The word was " + wordle.getGameWord());
    }
}

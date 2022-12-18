package com.example.wordle_clone;

/**
 * Drives the program.
 * @author Mahannah
 * @version 17/12/2022
 */
public final class Driver {
    private Driver() { }

    /**
     * Drives the program.
     * @param args to be read.
     */
    public static void main(final String[] args) {

        Wordle wordle = new Wordle();
        Player player = new Player();

        String playerGuessWord = "";

        System.out.println(
                """
                ------------------
                ** WORDLE CLONE **
                ------------------""");

        // Game loop
        while (player.getPlayerTurn() < Player.MAX_NUMBER_PLAYER_TURNS) {
            boolean invalidUserGuess = true;

            // Check that player enters a valid word.
            while (invalidUserGuess) {
                System.out.print("\nEnter a five-letter word: ");
                playerGuessWord = player.getGuessWord();

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
                    LetterPrinter.printLetterWithBackgroundColor(letter, LetterPrinter.GREEN_BACKGROUND);
                    wordle.updateWinCondition(index);
                    player.removeLetterFromGuessWord(index);

                } else if (wordle.letterInIncorrectPosition(letter, wordle.getGameWord())) {
                    LetterPrinter.printLetterWithBackgroundColor(letter, LetterPrinter.YELLOW_BACKGROUND);
                    player.removeLetterFromGuessWord(wordle.getGameWord().indexOf(letter));

                } else {
                     LetterPrinter.printLetterWithoutBackgroundColor(letter);
                     player.removeLetterFromGuessWord(index);
                 }
            }
            if (wordle.winConditionMet()) {
                System.out.println("\nCongratulations! You guessed the word!");
                System.exit(0);
            }
            player.incrementPlayerTurn();
            System.out.println("\nYou have " + (Player.MAX_NUMBER_PLAYER_TURNS - player.getPlayerTurn()) + " turns remaining.");
        }
        System.out.println("You lost! The word was " + wordle.getGameWord());
    }
}

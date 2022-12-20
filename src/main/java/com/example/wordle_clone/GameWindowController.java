package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controls the GameWindow class.
 * @author Mahannah
 * @version 20-12-22
 */
public class GameWindowController {

    private static final int MAX_WORD_LENGTH = 5;

    private final Wordle    wordle;
    private final Player    player;
    private final Label[][] gameBoard;
    private final String[]  word;

    /*
     * As per Wordle game rules, there are six rows, with five letters per row, for a
     * total of 30 letters. Each Label, below, represents one of the those letters.
     */
    // Row 1
    @FXML private Label box00;
    @FXML private Label box01;
    @FXML private Label box02;
    @FXML private Label box03;
    @FXML private Label box04;

    // Row 2
    @FXML private Label box10;
    @FXML private Label box11;
    @FXML private Label box12;
    @FXML private Label box13;
    @FXML private Label box14;

    // Row 3
    @FXML private Label box20;
    @FXML private Label box21;
    @FXML private Label box22;
    @FXML private Label box23;
    @FXML private Label box24;

    // Row 4
    @FXML private Label box30;
    @FXML private Label box31;
    @FXML private Label box32;
    @FXML private Label box33;
    @FXML private Label box34;

    // Row 5
    @FXML private Label box40;
    @FXML private Label box41;
    @FXML private Label box42;
    @FXML private Label box43;
    @FXML private Label box44;

    // Row 6
    @FXML private Label box50;
    @FXML private Label box51;
    @FXML private Label box52;
    @FXML private Label box53;
    @FXML private Label box54;

    private int rowIndex = 0;
    private int letterCounter = 0;

    /**
     * Creates an object of type GameWindowController.
     */
    public GameWindowController() {
        wordle = new Wordle();
        player = new Player();
        word   = new String[MAX_WORD_LENGTH];

        gameBoard = new Label[][] {
                {box00, box01, box02, box03, box04},
                {box10, box11, box12, box13, box14},
                {box20, box21, box22, box23, box24},
                {box30, box31, box32, box33, box34},
                {box40, box41, box42, box43, box44},
                {box50, box51, box52, box53, box54}};
    }

    protected void aButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "a";
            letterCounter++;
        }
    }

    protected void bButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "b";
            letterCounter++;
        }
    }

    protected void cButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "c";
            letterCounter++;
        }
    }

    protected void dButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "d";
            letterCounter++;
        }
    }

    protected void eButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "e";
            letterCounter++;
        }
    }

    protected void fButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "f";
            letterCounter++;
        }
    }

    protected void gButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "g";
            letterCounter++;
        }
    }

    protected void hButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "h";
            letterCounter++;
        }
    }

    protected void iButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "i";
            letterCounter++;
        }
    }
    protected void jButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "j";
            letterCounter++;
        }
    }
    protected void kButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "k";
            letterCounter++;
        }
    }
    protected void lButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "l";
            letterCounter++;
        }
    }
    protected void mButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "m";
            letterCounter++;
        }
    }
    protected void nButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "n";
            letterCounter++;
        }
    }
    protected void oButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "o";
            letterCounter++;
        }
    }
    protected void pButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "p";
            letterCounter++;
        }
    }
    protected void qButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "q";
            letterCounter++;
        }
    }
    protected void rButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "r";
            letterCounter++;
        }
    }
    protected void sButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "s";
            letterCounter++;
        }
    }
    protected void tButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "t";
            letterCounter++;
        }
    }
    protected void uButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "u";
            letterCounter++;
        }
    }
    protected void vButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "v";
            letterCounter++;
        }
    }
    protected void wButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "w";
            letterCounter++;
        }
    }
    protected void xButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "x";
            letterCounter++;
        }
    }
    protected void yButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "y";
            letterCounter++;
        }
    }
    protected void zButtonClicked() {
        if (letterCounter < MAX_WORD_LENGTH) {
            word[letterCounter] = "z";
            letterCounter++;
        }
    }

    /**
     * Checks user-inputted word against conditions, then prints the
     * word to the GUI using colors based on the different conditions.
     */
    @FXML protected void onEnterButtonClick() {

        // Player gets limited number of guesses.
        while (player.getPlayerTurn() < Player.MAX_NUMBER_PLAYER_TURNS) {

            // Validate user guess.
            do {
                String playerWord = String.join("", word);
                player.setGuessWord(playerWord);
            } while (!wordle.validateUserGuess(player.getGuessWord()));

            // Compare user guess against game word; color letters as required.
            for (int letterIndex = 0; letterIndex < Wordle.LETTERS_PER_WORD; letterIndex++) {

                String[] playerWordLetters = player.getGuessWord().split("");
                String[] gameWordLetters = wordle.getGameWord().split("");
                String letter = playerWordLetters[letterIndex];

                // The Label node that displays the letters.
                Label letterBox = gameBoard[rowIndex][letterIndex];
                letterBox.setText(letter.toUpperCase());

                if (!wordle.getGameWord().contains(letter)) {
                    LetterPrinter.printLetter(letterBox, LetterPrinter.GREY);
                    wordle.updateWinCondition(letterIndex);
                } else if (letter.equals(gameWordLetters[letterIndex])) {
                    LetterPrinter.printLetter(letterBox, LetterPrinter.GREEN);
                } else {
                    LetterPrinter.printLetter(letterBox, LetterPrinter.YELLOW);
                }
                if (letterIndex == (Wordle.LETTERS_PER_WORD - 1)) {
                    rowIndex++;
                }
            }
            if (wordle.winConditionMet()) {
                System.out.println("\nCongratulations! You guessed the word!");
                System.exit(0);
            }
            player.incrementPlayerTurn();
        }
        System.out.println("You lost! The word was " + wordle.getGameWord());
    }
}

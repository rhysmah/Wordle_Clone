package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Arrays;

/**
 * Controls the GameWindow class.
 * @author Mahannah
 * @version 23-12-22
 */
public class GameWindowController {

    private static final int MAX_WORD_LENGTH = 5;

    private final Wordle   wordle;
    private final Player   player;
    private final String[] userGuessLetters;

    /*
     * All the boxes, organized by row, where user guess letters appear.
     */
    @FXML private Label box00;
    @FXML private Label box01;
    @FXML private Label box02;
    @FXML private Label box03;
    @FXML private Label box04;

    @FXML private Label box10;
    @FXML private Label box11;
    @FXML private Label box12;
    @FXML private Label box13;
    @FXML private Label box14;

    @FXML private Label box20;
    @FXML private Label box21;
    @FXML private Label box22;
    @FXML private Label box23;
    @FXML private Label box24;

    @FXML private Label box30;
    @FXML private Label box31;
    @FXML private Label box32;
    @FXML private Label box33;
    @FXML private Label box34;

    @FXML private Label box40;
    @FXML private Label box41;
    @FXML private Label box42;
    @FXML private Label box43;
    @FXML private Label box44;

    @FXML private Label box50;
    @FXML private Label box51;
    @FXML private Label box52;
    @FXML private Label box53;
    @FXML private Label box54;

    /*
     * All the buttons available to the player.
     */
    @FXML private Button backspace;
    @FXML private Button enter;
    @FXML private Button a;
    @FXML private Button b;
    @FXML private Button c;
    @FXML private Button d;
    @FXML private Button e;
    @FXML private Button f;
    @FXML private Button g;
    @FXML private Button h;
    @FXML private Button i;
    @FXML private Button j;
    @FXML private Button k;
    @FXML private Button l;
    @FXML private Button m;
    @FXML private Button n;
    @FXML private Button o;
    @FXML private Button p;
    @FXML private Button q;
    @FXML private Button r;
    @FXML private Button s;
    @FXML private Button t;
    @FXML private Button u;
    @FXML private Button v;
    @FXML private Button w;
    @FXML private Button x;
    @FXML private Button y;
    @FXML private Button z;

    private int rowIndex    = 0;
    private int letterIndex = 0;

    private Label[][] gameBoardTiles;

    // TODO -- create animation for letters.

    /**
     * Creates an object of type GameWindowController.
     */
    public GameWindowController() {
        wordle           = new Wordle();
        player           = new Player();
        userGuessLetters = new String[MAX_WORD_LENGTH];

        System.out.println(wordle.getGameWord());
    }

    /**
     * Creates a 2D array of Labels.
     */
    public void initializeLetterBoxes() {
        gameBoardTiles = new Label[][] {
                {box00, box01, box02, box03, box04},
                {box10, box11, box12, box13, box14},
                {box20, box21, box22, box23, box24},
                {box30, box31, box32, box33, box34},
                {box40, box41, box42, box43, box44},
                {box50, box51, box52, box53, box54}};
    }

    /**
     * Initializes all buttons.
     */
    public void initializeButtons() {
        backspace.setOnAction(event -> backspaceButtonPushed());
        enter.setOnAction(event -> enterButtonPushed());
        a.setOnAction(event -> selectLetterLocation("A"));
        b.setOnAction(event -> selectLetterLocation("B"));
        c.setOnAction(event -> selectLetterLocation("C"));
        d.setOnAction(event -> selectLetterLocation("D"));
        e.setOnAction(event -> selectLetterLocation("E"));
        f.setOnAction(event -> selectLetterLocation("F"));
        g.setOnAction(event -> selectLetterLocation("G"));
        h.setOnAction(event -> selectLetterLocation("H"));
        i.setOnAction(event -> selectLetterLocation("I"));
        j.setOnAction(event -> selectLetterLocation("J"));
        k.setOnAction(event -> selectLetterLocation("K"));
        l.setOnAction(event -> selectLetterLocation("L"));
        m.setOnAction(event -> selectLetterLocation("M"));
        n.setOnAction(event -> selectLetterLocation("N"));
        o.setOnAction(event -> selectLetterLocation("O"));
        p.setOnAction(event -> selectLetterLocation("P"));
        q.setOnAction(event -> selectLetterLocation("Q"));
        r.setOnAction(event -> selectLetterLocation("R"));
        s.setOnAction(event -> selectLetterLocation("S"));
        t.setOnAction(event -> selectLetterLocation("T"));
        u.setOnAction(event -> selectLetterLocation("U"));
        v.setOnAction(event -> selectLetterLocation("V"));
        w.setOnAction(event -> selectLetterLocation("W"));
        x.setOnAction(event -> selectLetterLocation("X"));
        y.setOnAction(event -> selectLetterLocation("Y"));
        z.setOnAction(event -> selectLetterLocation("Z"));
    }

    /*
     * Adds letters sequentially to each Label.
     */
    private void selectLetterLocation(final String letter) {
        if (letterIndex < MAX_WORD_LENGTH) {
            gameBoardTiles[rowIndex][letterIndex].setText(letter);
            userGuessLetters[letterIndex] = letter;
            letterIndex++;
        }
    }

    /*
     * Print out user letters.
     */
    private void printOutUserLetters() {

        letterIndex = 0;
        String[] gameWordLetters = wordle.getGameWord().split("");

        // Compares all five letters of the user guess word against the game word.
        while (letterIndex < MAX_WORD_LENGTH) {
            String letter = userGuessLetters[letterIndex];

            /* If the position of a letter in a user word is the exact same as the position
             * of a letter in the game word, make the square GREEN.
             */
            if (letter.equals(gameWordLetters[letterIndex])) {
                LetterPrinter.printLetter(gameBoardTiles[rowIndex][letterIndex], LetterPrinter.GREEN);
                gameWordLetters[letterIndex] = "";
                userGuessLetters[letterIndex] = "";
                wordle.updateWinCondition(letterIndex);
            /*
             * If a letter in the user word exists in the game word, but in a different place,
             * then make the square YELLOW.
             */
            } else if (Arrays.asList(gameWordLetters).contains(letter)) {
                LetterPrinter.printLetter(gameBoardTiles[rowIndex][letterIndex], LetterPrinter.YELLOW);
                gameWordLetters[Arrays.asList(gameWordLetters).indexOf(letter)] = "";
                userGuessLetters[letterIndex] = "";
            /*
             * If the user word contains letters not in the game word, then keep the square GREY.
             */
            } else {
                LetterPrinter.printLetter(gameBoardTiles[rowIndex][letterIndex], LetterPrinter.GREY);
            }
            letterIndex++;
        }
    }

    /*
     * Comment needed.
     */
    private void checkIfWinConditionMet() {
        if (wordle.winConditionMet()) {
            // Pop up if user meets win condition.
            System.out.println("Congratulations! You guessed the word.");
        } else {
            wordle.resetWinCondition();
        }
    }

    /**
     * Info needed.
     * @param letter the value of the letter key pushed.
     */
    protected void letterKeyPushed(final String letter) {
        selectLetterLocation(letter.toUpperCase());
    }

    /*
     * Comment needed.
     */
    private void checkIfPlayerHasTurnsRemaining() {
        if (player.getPlayerTurn() == Player.MAX_NUMBER_PLAYER_TURNS) {
            // Pop up that tells player they've lost.
            System.out.println("You lost! The word was " + wordle.getGameWord());
        }
    }

    /**
     * Removes letters sequentially from each Label.
     */
    protected void backspaceButtonPushed() {
        if (letterIndex > 0) {
            letterIndex--;
            gameBoardTiles[rowIndex][letterIndex].setText("");
        }
    }

    /**
     * Info needed.
     */
    protected void enterButtonPushed() {

        // Player cannot do anything until they've entered a five-letter word.
        if (letterIndex == MAX_WORD_LENGTH) {

            // Concatenate letters into single user word String.
            String userGuessWord = String.join("", userGuessLetters);

            // Check if the user guess is valid.
            if (wordle.validateUserGuess(userGuessWord)) {

                player.incrementPlayerTurn();     // If a valid word, then increment turn.

                letterIndex = 0;                  // Start at the beginning of the user word.
                printOutUserLetters();            // Prints color-coded letters.
                checkIfWinConditionMet();         // Game ends if player correctly guesses word.
                checkIfPlayerHasTurnsRemaining(); // Game ends if player runs out of turns.

                // Move to the beginning of the next row.
                rowIndex++;
                letterIndex = 0;
            }
        }
    }
}

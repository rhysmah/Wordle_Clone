package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controls the GameWindow class.
 * @author Mahannah
 * @version 19-12-22
 */
public class GameWindowController {

    private final Wordle wordle = new Wordle();
    private final Player player = new Player();

    // Row 1
    @FXML
    private Label box00;
    @FXML
    private Label box01;
    @FXML
    private Label box02;
    @FXML
    private Label box03;
    @FXML
    private Label box04;

    // Row 2
    @FXML
    private Label box10;
    @FXML
    private Label box11;
    @FXML
    private Label box12;
    @FXML
    private Label box13;
    @FXML
    private Label box14;

    // Row 3
    @FXML
    private Label box20;
    @FXML
    private Label box21;
    @FXML
    private Label box22;
    @FXML
    private Label box23;
    @FXML
    private Label box24;

    // Row 4
    @FXML
    private Label box30;
    @FXML
    private Label box31;
    @FXML
    private Label box32;
    @FXML
    private Label box33;
    @FXML
    private Label box34;

    // Row 5
    @FXML
    private Label box40;
    @FXML
    private Label box41;
    @FXML
    private Label box42;
    @FXML
    private Label box43;
    @FXML
    private Label box44;

    // Row 6
    @FXML
    private Label box50;
    @FXML
    private Label box51;
    @FXML
    private Label box52;
    @FXML
    private Label box53;
    @FXML
    private Label box54;

    private int rowIndex = 0;
    private String gameWord;

    @FXML
    private TextField inputBox;

    /**
     * Creates an object of type GameWindowController.
     */
    public GameWindowController() {
        this.gameWord = wordle.getGameWord();
    }

    /**
     * Checks user-inputted word against conditions, then prints the
     * word to the GUI using colors assigned to those different conditions.
     */
    @FXML
    protected void onCheckGuessButtonClick() {

        Label[][] gameBoard = {
                {box00, box01, box02, box03, box04},
                {box10, box11, box12, box13, box14},
                {box20, box21, box22, box23, box24},
                {box30, box31, box32, box33, box34},
                {box40, box41, box42, box43, box44},
                {box50, box51, box52, box53, box54}};

        String playerGuessWord = inputBox.getText();
        player.setGuessWord(playerGuessWord);
        System.out.println(gameWord);

        for (int index = 0; index < Wordle.LETTERS_PER_WORD; index++) {

            String[] playerWordLetters = playerGuessWord.toUpperCase().split("");
            String   letter            = playerWordLetters[index];

            String[] gameWordLetters = gameWord.toUpperCase().split("");
            Label    letterBox       = gameBoard[rowIndex][index];

            /*
             * If the letter is NOT in the game word, the tile is grey.
             *
             * If the letter is in the game word, in the exact right spot, the tile is green.
             *
             * If the letter is in the game word, but NOT in the right spot, the tile is yellow.
             */
            if (!gameWord.contains(letter)) {
                LetterPrinterGUI.printLetter(letterBox, letter, LetterPrinterGUI.GREY);
            } else if (letter.equals(gameWordLetters[index])) {
                LetterPrinterGUI.printLetter(letterBox, letter, LetterPrinterGUI.GREEN);
            } else {
                LetterPrinterGUI.printLetter(letterBox, letter, LetterPrinterGUI.YELLOW);
            }
            if (index == (Wordle.LETTERS_PER_WORD - 1)) {
                rowIndex++;
            }
        }
    }
}

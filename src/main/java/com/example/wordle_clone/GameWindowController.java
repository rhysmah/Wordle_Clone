package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GameWindowController {
    public GameWindowController() { }

    @FXML
    Button checkGuessButton;
    Wordle wordle = new Wordle();
    Player player = new Player();

    @FXML private TextField inputBox;

    @FXML private Label box00 = new Label();
    @FXML private Label box01 = new Label();
    @FXML private Label box02 = new Label();
    @FXML private Label box03 = new Label();
    @FXML private Label box04 = new Label();

    @FXML private Label box10 = new Label();
    @FXML private Label box11 = new Label();
    @FXML private Label box12 = new Label();
    @FXML private Label box13 = new Label();
    @FXML private Label box14 = new Label();

    @FXML private Label box20 = new Label();
    @FXML private Label box21 = new Label();
    @FXML private Label box22 = new Label();
    @FXML private Label box23 = new Label();
    @FXML private Label box24 = new Label();

    @FXML private Label box30 = new Label();
    @FXML private Label box31 = new Label();
    @FXML private Label box32 = new Label();
    @FXML private Label box33 = new Label();
    @FXML private Label box34 = new Label();

    @FXML private Label box40 = new Label();
    @FXML private Label box41 = new Label();
    @FXML private Label box42 = new Label();
    @FXML private Label box43 = new Label();
    @FXML private Label box44 = new Label();

    @FXML private Label box50 = new Label();
    @FXML private Label box51 = new Label();
    @FXML private Label box52 = new Label();
    @FXML private Label box53 = new Label();
    @FXML private Label box54 = new Label();

    @FXML
    Label[][] gameBoard = {
            {box00, box01, box02, box03, box04},
            {box10, box11, box12, box13, box14},
            {box20, box21, box22, box23, box24},
            {box30, box31, box32, box33, box34},
            {box40, box41, box42, box43, box44},
            {box50, box51, box52, box53, box54}
    };

    @FXML
    protected void onCheckGuessButtonClick() {

        player.setGuessWord(inputBox.getText());

        for (int index = 0; index < 5; index++) {
            String[] playerGuessLetters = player.getGuessWord().toUpperCase().split("");
            String   letter             = playerGuessLetters[index];

            if (wordle.letterInCorrectPosition(letter, wordle.getGameWord(), index)) {
                LetterPrinterGUI.printLetterBackground(gameBoard[0][index], LetterPrinterGUI.GREEN);
                gameBoard[0][index].setText(letter);
                wordle.updateWinCondition(index);
                player.removeLetterFromGuessWord(index);

            } else if (wordle.letterInIncorrectPosition(letter, wordle.getGameWord())) {
                LetterPrinterGUI.printLetterBackground(gameBoard[0][index], LetterPrinterGUI.YELLOW);
                gameBoard[0][index].setText(letter);
                player.removeLetterFromGuessWord(wordle.getGameWord().indexOf(letter));

            } else {
                LetterPrinterGUI.printLetterBackground(gameBoard[0][index], LetterPrinterGUI.GREY);
                gameBoard[0][index].setText(letter);
                player.removeLetterFromGuessWord(index);
            }
        }
    }
}

package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Controls the GameWindow class.
 * @author Mahannah
 * @version 23-12-22
 */
public class GameWindowController {

    private static final int MAX_WORD_LENGTH = 5;

    private final Wordle wordle;
    private final String[] userGuess;

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

    // Buttons
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

    private Label[][] letters;

    /**
     * Creates an object of type GameWindowController.
     */
    public GameWindowController() {
        userGuess = new String[MAX_WORD_LENGTH];
        wordle = new Wordle();
    }

    /**
     * Creates a 2D array of Labels.
     */
    public void initializeLetterBoxes() {
        letters = new Label[][] {
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
        backspace.setOnAction(event -> backspaceButtonClicked());
        enter.setOnAction(event -> enterButtonClicked());
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
            letters[rowIndex][letterIndex].setText(letter);
            userGuess[letterIndex] = letter;
            letterIndex++;
        }
    }

    private void enterButtonClicked() {
        System.out.println(wordle.getGameWord());
        letterIndex = 0;
        String word = String.join("", userGuess).toLowerCase();
        if (!wordle.validateUserGuess(word)) {
            System.out.println("NOT A WORD!");
        } else {
            letterIndex = 0;
            while (letterIndex < MAX_WORD_LENGTH) {
                String[] gameWordArray = wordle.getGameWord().toLowerCase().split("");
                if (userGuess[letterIndex].toLowerCase().equals(gameWordArray[letterIndex])) {
                    LetterPrinter.printLetter(letters[rowIndex][letterIndex], LetterPrinter.GREEN);
                } else if (!wordle.getGameWord().contains(userGuess[letterIndex])) {
                    LetterPrinter.printLetter(letters[rowIndex][letterIndex], LetterPrinter.GREY);
                } else {
                    LetterPrinter.printLetter(letters[rowIndex][letterIndex], LetterPrinter.YELLOW);
                }
                letterIndex++;
            }
        }
    }

    private void backspaceButtonClicked() {
        if (letterIndex > 0) {
            letterIndex--;
            letters[rowIndex][letterIndex].setText("");
        }
    }
}

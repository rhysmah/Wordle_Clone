package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

/**
 * Controls the GameWindow class.
 * @author Mahannah
 * @version 20-12-22
 */
public class GameWindowController {

    private static final int MAX_WORD_LENGTH = 5;

    private final Wordle    wordle;
    private final Player    player;
    private final String[]  word;

    /*
     * As per Wordle game rules, there are six rows, with five letters per row, for a
     * total of 30 letters. Each Label, below, represents one of the those letters.
     */
    // Row 1
    @FXML private Label box00 = new Label();
    @FXML private Label box01 = new Label();
    @FXML private Label box02 = new Label();
    @FXML private Label box03 = new Label();
    @FXML private Label box04 = new Label();

    // Row 2
    @FXML private Label box10 = new Label();
    @FXML private Label box11 = new Label();
    @FXML private Label box12 = new Label();
    @FXML private Label box13 = new Label();
    @FXML private Label box14 = new Label();

    // Row 3
    @FXML private Label box20 = new Label();
    @FXML private Label box21 = new Label();
    @FXML private Label box22 = new Label();
    @FXML private Label box23 = new Label();
    @FXML private Label box24 = new Label();

    // Row 4
    @FXML private Label box30 = new Label();
    @FXML private Label box31 = new Label();
    @FXML private Label box32 = new Label();
    @FXML private Label box33 = new Label();
    @FXML private Label box34 = new Label();

    // Row 5
    @FXML private Label box40 = new Label();
    @FXML private Label box41 = new Label();
    @FXML private Label box42 = new Label();
    @FXML private Label box43 = new Label();
    @FXML private Label box44 = new Label();

    // Row 6
    @FXML private Label box50 = new Label();
    @FXML private Label box51 = new Label();
    @FXML private Label box52 = new Label();
    @FXML private Label box53 = new Label();
    @FXML private Label box54 = new Label();

    // Buttons
    @FXML private Button enter;
    @FXML private Button backspace;
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

    @FXML private HBox row1 = new HBox();
    @FXML private HBox row2 = new HBox();
    @FXML private HBox row3 = new HBox();

    private int rowIndex      = 0;
    private int letterIndex   = 0;
    private int letterCounter = 0;

    /**
     * Creates an object of type GameWindowController.
     */
    public GameWindowController() {
        this.wordle = new Wordle();
        this.player = new Player();
        this.word = new String[MAX_WORD_LENGTH];
    }

    /**
     * Initializes all buttons.
     */
    public void initialize() {
        a.setOnAction(event -> {
        });

        b.setOnAction(event -> {
        });

        c.setOnAction(event -> {
        });

        d.setOnAction(event -> {
        });

        e.setOnAction(event -> {
        });

        f.setOnAction(event -> {
        });

        g.setOnAction(event -> {
        });

        h.setOnAction(event -> {
        });

        i.setOnAction(event -> {
        });

        j.setOnAction(event -> {
        });

        k.setOnAction(event -> {
        });

        l.setOnAction(event -> {
        });

        m.setOnAction(event -> {
        });

        n.setOnAction(event -> {
        });

        o.setOnAction(event -> {
        });

        p.setOnAction(event -> {
        });

        q.setOnAction(event -> {
        });

        r.setOnAction(event -> {
        });

        s.setOnAction(event -> {
        });

        t.setOnAction(event -> {
        });

        u.setOnAction(event -> {
        });

        v.setOnAction(event -> {
        });

        w.setOnAction(event -> {
        });

        x.setOnAction(event -> {
        });

        y.setOnAction(event -> {
        });

        z.setOnAction(event -> {
        });

        enter.setOnAction(event -> {

        });

        backspace.setOnAction(event -> {

        });
    }




//    protected void letterKeyPushed(final String letter) {
//        gameBoard[0].setText(letter);
//        if (letterIndex < 5) {
//        } else {
//            rowIndex++;
//            letterIndex = 0;
//        }
//    }
//
//    protected void enterKeyPushed() { }
//
//    protected void backspaceKeyPushed() { }
}

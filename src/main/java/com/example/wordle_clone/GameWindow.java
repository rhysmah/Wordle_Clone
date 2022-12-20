package com.example.wordle_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Creates a game window.
 * @author Mahannah
 * @version 20-12-22
 */
public class GameWindow extends Application {

    @Override
    public void start(final Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(GameWindow.class.getResource("/game-window.fxml"));
        Parent root = loader.load();
        Scene gameScene = new Scene(root);
        GameWindowController controller = loader.getController();

        // Handles all key presses for the scene.
        gameScene.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()) {
                case A -> controller.aButtonClicked();
                case B -> controller.bButtonClicked();
                case C -> controller.cButtonClicked();
                case D -> controller.dButtonClicked();
                case E -> controller.eButtonClicked();
                case F -> controller.fButtonClicked();
                case G -> controller.gButtonClicked();
                case H -> controller.hButtonClicked();
                case I -> controller.iButtonClicked();
                case J -> controller.jButtonClicked();
                case K -> controller.kButtonClicked();
                case L -> controller.lButtonClicked();
                case M -> controller.mButtonClicked();
                case N -> controller.nButtonClicked();
                case O -> controller.oButtonClicked();
                case P -> controller.pButtonClicked();
                case Q -> controller.qButtonClicked();
                case R -> controller.rButtonClicked();
                case S -> controller.sButtonClicked();
                case T -> controller.tButtonClicked();
                case U -> controller.uButtonClicked();
                case V -> controller.vButtonClicked();
                case W -> controller.wButtonClicked();
                case X -> controller.xButtonClicked();
                case Y -> controller.yButtonClicked();
                case Z -> controller.zButtonClicked();
            }
        });

        stage.setScene(gameScene);
        stage.show();
    }
}

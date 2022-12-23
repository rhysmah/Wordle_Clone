package com.example.wordle_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Creates a game window.
 * @author Mahannah
 * @version 23-12-22
 */
public class GameWindow extends Application {

    private static final int WINDOW_WIDTH_IN_PIXELS = 500;
    private static final int WINDOW_HEIGHT_IN_PIXELS = 650;


    @Override
    public void start(final Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(GameWindow.class.getResource("/game-window.fxml"));
        Scene gameScene = new Scene(fxmlLoader.load(), WINDOW_WIDTH_IN_PIXELS, WINDOW_HEIGHT_IN_PIXELS);
        GameWindowController controller = fxmlLoader.getController();

//        gameScene.setOnKeyPressed(keyEvent -> {
//            if (keyEvent.getCode().isLetterKey()) {
//                controller.letterKeyPushed(keyEvent.getText());
//            }
//            if (keyEvent.getCode() == KeyCode.ENTER) {
//                controller.enterKeyPushed();
//            }
//            if (keyEvent.getCode() == KeyCode.BACK_SPACE) {
//                controller.backspaceKeyPushed();
//            }
//        });

    stage.setScene(gameScene);
    stage.show();
    controller.initializeLetterBoxes();
    controller.initializeLetters();
    }
}


package com.example.wordle_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * Creates a game window.
 * @author Mahannah
 * @version 20-12-22
 */
public class GameWindow extends Application {

    @Override
    public void start(final Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(GameWindow.class.getResource("/game-window.fxml"));
        Scene gameScene = new Scene(fxmlLoader.load(), 500, 650);
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
    controller.initialize();
    }
}


package com.example.wordle_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Creates a game window.
 * @author Mahannah
 * @version 20-12-22
 */
public class GameWindow extends Application {

    private static final int GAME_WINDOW_WIDTH_IN_PIXELS = 500;
    private static final int GAME_WINDOW_HEIGHT_IN_PIXELS = 650;

    @Override
    public void start(final Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(GameWindow.class.getResource("/game-window.fxml"));
        Scene gameScene = new Scene(fxmlLoader.load(), GAME_WINDOW_WIDTH_IN_PIXELS, GAME_WINDOW_HEIGHT_IN_PIXELS);
        stage.setScene(gameScene);
        stage.show();
    }
}

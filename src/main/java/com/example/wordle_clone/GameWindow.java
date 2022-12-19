package com.example.wordle_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameWindow extends Application {

    @Override
    public void start(final Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(GameWindow.class.getResource("/game-window.fxml"));
        Scene gameScene = new Scene(fxmlLoader.load(), 500, 650);
        stage.setScene(gameScene);
        stage.show();
    }
}

package com.example.wordle_clone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Represents a main menu.
 * @author Mahannah
 * @version 20-12-22
 */
public class MainMenu extends Application {

    @Override
    public void start(final Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenu.class.getResource("/main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Wordle Clone");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Drives the program.
     * @param args to be passed.
     */
    public static void main(final String[] args) {
        launch();
    }
}
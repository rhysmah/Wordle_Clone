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

    private static final int MAIN_MENU_WIDTH  = 320;
    private static final int MAIN_MENU_HEIGHT = 240;

    /**
     * Starts the main menu.
     * @param stage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws IOException if main-menu.fxml cannot be found.
     */
    @Override
    public void start(final Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenu.class.getResource("/main-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), MAIN_MENU_WIDTH, MAIN_MENU_HEIGHT);
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

package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Controls the main menu, which drives the program.
 * @author Mahannah
 * @version 18-12-2022
 */
public class MainMenuController {

    private static final String MAIN_MENU_WINDOW_TITLE = "Wordle Clone";
    @FXML private Button quitGameButton;

    /**
     * Starts a new game.
     */
    @FXML
    private void startGameButtonClick() {
    }

    /*
     * Terminates the application.
     */
    @FXML
    private void quitGameButtonClick() {
        Stage stage = (Stage) quitGameButton.getScene().getWindow();
        stage.close();
    }
}

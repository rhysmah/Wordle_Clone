package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Controls the main menu, which drives the program.
 * @author Mahannah
 * @version 24-12-2022
 */
public class MainMenuController {

    private static final int WINDOW_WIDTH_IN_PIXELS  = 500;
    private static final int WINDOW_HEIGHT_IN_PIXELS = 650;

    @FXML private Button quitGameButton;

    /**
     * Starts a new game.
     * @throws IOException if the game-window.fxml file cannot be found.
     */
    @FXML
    private void startGameButtonClick() throws IOException {

        Stage stage                     = new Stage();
        FXMLLoader fxmlLoader           = new FXMLLoader(MainMenu.class.getResource("/game-window.fxml"));
        Scene gameScene                 = new Scene(fxmlLoader.load(), WINDOW_WIDTH_IN_PIXELS, WINDOW_HEIGHT_IN_PIXELS);
        GameWindowController controller = fxmlLoader.getController();

        // Sets up key presses from the keyboard.
        gameScene.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode().isLetterKey()) {
                controller.letterKeyPushed(keyEvent.getText());
            }
            if (keyEvent.getCode() == KeyCode.ENTER) {
                controller.enterButtonPushed();
            }
            if (keyEvent.getCode() == KeyCode.BACK_SPACE) {
                controller.backspaceButtonPushed();
            }
        });
        stage.setScene(gameScene);
        stage.show();
        controller.initializeLetterBoxes();
        controller.initializeButtons();
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

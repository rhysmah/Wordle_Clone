package com.example.wordle_clone;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Controls the main menu, which drives the program.
 * @author Mahannah 2022
 * @version 12-12-2022
 */
public class MainMenuController {

    private static final String MAIN_MENU_WINDOW_TITLE = "Wordle Clone";
    
    @FXML private Button quitGameButton;

    /**
     * Starts a new game and places this window, the main menu window,
     * behind the new window.
     */
    @FXML
    private void startGameButtonClick() {
        return;
//        Stage mainMenu = new Stage();
//        Text placeholderText = new Text("Placeholder");
//
//        Group root = new Group(placeholderText);
//        Scene scene = new Scene(root);
//
//        mainMenu.setTitle(MAIN_MENU_WINDOW_TITLE);
//        mainMenu.setScene(scene);
//        mainMenu.show();
    }

    /*
     * Determines in which scene the quit game button is located,
     * then closes the window, and thus ends the application.
     */
    @FXML
    private void quitGameButtonClick() {
        Stage stage = (Stage) quitGameButton.getScene().getWindow();
        stage.close();
    }
}

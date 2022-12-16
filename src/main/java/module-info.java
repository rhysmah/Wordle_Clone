module com.example.wordle_clone {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.wordle_clone to javafx.fxml;
    exports com.example.wordle_clone;
}
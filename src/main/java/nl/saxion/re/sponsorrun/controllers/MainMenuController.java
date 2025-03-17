package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class MainMenuController {
    @FXML
    public VBox vbox;

    @FXML
    public ImageView imageView;

    @FXML
    public TextField nameField;

    @FXML
    public TextField passwordField;

    @FXML
    public void initialize() {
        imageView.setImage(new Image(getClass().getResource("/image/logo.png").toExternalForm()));

        nameField.setPromptText("Username");
        passwordField.setPromptText("Password");

        vbox = new VBox();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onFirstButtonClick() {
        WindowHelper.openWindow("tournament-screen.fxml", "Tournaments", 750, 600);
    }

    @FXML
    protected void onSecondButtonClick() {
        WindowHelper.openWindow("another-screen.fxml", "Wow, such empty", 800, 600);
    }
}
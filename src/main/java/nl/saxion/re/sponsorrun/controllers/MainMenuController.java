package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class MainMenuController {
    @FXML
    public ImageView imageView;

    @FXML
    public void initialize() {
        imageView.setImage(new Image(getClass().getResource("/image/logo.png").toExternalForm()));
    }


    @FXML
    private Label welcomeText;

    @FXML
    protected void onFirstButtonClick() {
        WindowHelper.openWindow("overview-screen.fxml", "Overview of politicians", 800, 600);
    }

    @FXML
    protected void onSecondButtonClick() {
        WindowHelper.openWindow("another-screen.fxml", "Wow, such empty", 800, 600);
    }
}
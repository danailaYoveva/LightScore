package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import nl.saxion.re.sponsorrun.util.WindowHelper;

public class TournamentScreenController {
    @FXML
    public Label label1;

    @FXML
    public ImageView imageView;

    @FXML
    public void initialize() {
        imageView.setImage(new Image(getClass().getResource("/image/logo.png").toExternalForm()));
    }

    @FXML
    protected void onFirstButtonClick() {
        WindowHelper.openWindow("another-screen.fxml", "Create a Tournament", 750, 600);
    }
}

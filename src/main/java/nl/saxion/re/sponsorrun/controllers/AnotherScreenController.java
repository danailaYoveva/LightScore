package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnotherScreenController {

    @FXML
    public DatePicker pickerDate;

    @FXML
    public TextField nameField;

    @FXML
    public ComboBox sport;

    @FXML
    public DatePicker pickerRegistration;

    @FXML
    public TextField maxTeams;

    @FXML
    public TextField address;

    @FXML
    public TextArea description;

    @FXML
    public ImageView logo;

    @FXML
    public void initialize(){
        nameField.setPromptText("Name");
        sport.setPromptText("Sport");
        pickerDate.setPromptText("Date");
        pickerRegistration.setPromptText("Registration end");
        maxTeams.setPromptText("Max. teams");
        address.setPromptText("Address");
        description.setPromptText("Description");
        logo.setImage(new Image(getClass().getResource("/image/logo.png").toExternalForm()));
    }
}

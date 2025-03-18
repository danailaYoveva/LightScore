package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AnotherScreenController {

    @FXML
    public DatePicker picker;

    @FXML
    public TextField nameField;

    @FXML
    public ComboBox sport;

    @FXML
    public void initialize(){
        nameField.setPromptText("Name");
        sport.setPromptText("Sport");
        picker.setPromptText("Date");
    }
}

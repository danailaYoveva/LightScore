package nl.saxion.re.sponsorrun.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class AnotherScreenController {

    @FXML
    public DatePicker picker;

    @FXML
    public void initialize(){
        picker.setUserData("121212");
    }
}

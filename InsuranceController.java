package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InsuranceController
{
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField adressField;
    @javafx.fxml.FXML
    private ComboBox<String> packages;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
        packages.getItems().addAll("Bronze Pack", "Silver Pack", "Gold Pack");
        packages.setValue("Choose Pack");
    }

    @javafx.fxml.FXML
    public void Buttononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PassengerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void ConfirmButtonOnClick(ActionEvent actionEvent) {
        label.setText(
                "Name: " + nameField.getText() + "\n" +
                        "Address: " + adressField.getText() + "\n" +
                        "Phone: " + phoneField.getText() + "\n" +
                        "Package: " + packages.getValue() + "\n" +
                        "*** Registered Successfully ***"
        );
    }
}

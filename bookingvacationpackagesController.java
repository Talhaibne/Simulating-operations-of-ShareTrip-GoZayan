package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class bookingvacationpackagesController
{
    @javafx.fxml.FXML
    private RadioButton tourGuide;
    @javafx.fxml.FXML
    private RadioButton upgrade;
    @javafx.fxml.FXML
    private RadioButton transfers;
    @javafx.fxml.FXML
    private TextField dealNameField;

    private ToggleGroup BookingToggleGroup;

    @javafx.fxml.FXML
    public void initialize() {
        BookingToggleGroup = new ToggleGroup();
        tourGuide.setToggleGroup(BookingToggleGroup);
        upgrade.setToggleGroup(BookingToggleGroup);
        transfers.setToggleGroup(BookingToggleGroup);
    }

    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"TravelAgentDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void ConfirmButtonOnClick(ActionEvent actionEvent) {
        RadioButton selectedRadioButton = (RadioButton) BookingToggleGroup.getSelectedToggle();

        if (selectedRadioButton != null) {
            String  additionalFeature = selectedRadioButton.getText();
            String  selectedDeal = dealNameField.getText();


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Selected Deal");
            alert.setHeaderText("Booking Details");
            alert.setContentText("Deal Name: " + selectedDeal + "\nAdditional Feature: " + additionalFeature);
            alert.showAndWait();
        } else {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Selection");
            alert.setHeaderText("No Reason Selected");
            alert.setContentText("Please select a reason before confirming.");
            alert.showAndWait();
        }
    }
}
package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class OfferingTravelInsurancetoConsumersController {
    @javafx.fxml.FXML
    private RadioButton cancelRB;
    @javafx.fxml.FXML
    private RadioButton lossRB;
    @javafx.fxml.FXML
    private RadioButton otherRB;
    @javafx.fxml.FXML
    private TextField reasonField;

    private ToggleGroup reasonToggleGroup;

    @javafx.fxml.FXML
    public void initialize() {

        reasonToggleGroup = new ToggleGroup();
        cancelRB.setToggleGroup(reasonToggleGroup);
        lossRB.setToggleGroup(reasonToggleGroup);
        otherRB.setToggleGroup(reasonToggleGroup);


    }

    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "TravelAgentDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void confirmButtonOnClick(ActionEvent actionEvent) {

        RadioButton selectedRadioButton = (RadioButton) reasonToggleGroup.getSelectedToggle();

        if (selectedRadioButton != null) {
            String selectedReason = selectedRadioButton.getText();
            String additionalReason = reasonField.getText();


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Selected Reason");
            alert.setHeaderText("Issue Details");
            alert.setContentText("Selected Reason: " + selectedReason + "\nAdditional Details: " + additionalReason);
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

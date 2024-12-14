package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @javafx.fxml.FXML
    private TextField NameField;
    @javafx.fxml.FXML
    private TextField PasswordField;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;

    @javafx.fxml.FXML
    public void initialize() {
        comboBox.getItems().addAll("Account Officer", "Admin", "Passenger", "Travel Agent");
        comboBox.setValue("Choose user type");
    }

    @javafx.fxml.FXML
    public void LoginButtonOnClick(ActionEvent actionEvent) throws IOException {
        String userId = NameField.getText();
        String password = PasswordField.getText();
        String selectedUserType = comboBox.getValue();


        if (userId.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Fields cannot be empty");
            alert.setContentText("Please enter ID and Password.");
            alert.showAndWait();
        }

        if (!"1234".equals(userId) || !"4321".equals(password)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Credentials");
            alert.setContentText("The ID or Password is incorrect.");
            alert.showAndWait();
        } else {
            switch (selectedUserType) {
                case "Admin":
                    SceneSwitcher.switchScene(actionEvent, "AdminDashboard.fxml");
                    break;
                case "Account Officer":
                    SceneSwitcher.switchScene(actionEvent, "AccountOfficerDashboard.fxml");
                    break;
                case "Passenger":
                    SceneSwitcher.switchScene(actionEvent, "PassengerDashboard.fxml");
                    break;
                case "Travel Agent":
                    SceneSwitcher.switchScene(actionEvent, "TravelAgentDashboard.fxml");
                    break;
                default:
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Invalid Selection");
                    alert.setContentText("Please select a valid user type.");
                    alert.showAndWait();
            }
        }



    }

}

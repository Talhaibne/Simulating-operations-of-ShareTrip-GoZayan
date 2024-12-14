package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SearchFlightController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtononClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PassengerDashboard.fxml");
    }
}
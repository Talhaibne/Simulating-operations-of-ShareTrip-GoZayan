package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class TravelalertAssistanceController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PassengerDashboard.fxml");
    }
}
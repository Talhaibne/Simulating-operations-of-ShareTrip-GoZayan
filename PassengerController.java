package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class PassengerController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButttonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void BookingButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Booking.fxml");
    }

    @javafx.fxml.FXML
    public void BookpackagedealButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PackageDeal.fxml");
    }

    @javafx.fxml.FXML
    public void WishlistButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Futurewishlist.fxml");
    }

    @javafx.fxml.FXML
    public void TravelAlertButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Travelalert&Assistance.fxml");
    }

    @javafx.fxml.FXML
    public void PaymentButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"PaymentProcess.fxml");
    }

    @javafx.fxml.FXML
    public void TravelButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Insurance.fxml");
    }

    @javafx.fxml.FXML
    public void searchflighButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"SearchFlight.fxml");
    }

    @javafx.fxml.FXML
    public void ViewManageButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ViewingManaging.fxml");
    }
}
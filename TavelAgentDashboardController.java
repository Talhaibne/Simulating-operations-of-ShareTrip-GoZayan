package com.example.gozyaan;

import javafx.event.ActionEvent;

import java.io.IOException;

public class TavelAgentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButttonOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"hello-view.fxml");
    }

    @javafx.fxml.FXML
    public void SearcgHotelonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"HotelBooking.fxml");

    }

    @javafx.fxml.FXML
    public void ManageGrpBooking(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"ManagingGroupBooking.fxml");
    }

    @javafx.fxml.FXML
    public void ClientAccountonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"HandlingClientsAccounts.fxml");
    }

    @javafx.fxml.FXML
    public void EvaluateFlightonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"EvaluateFlight.fxml");
    }

    @javafx.fxml.FXML
    public void TravelReserveonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"Reservation&SpecialRequest.fxml");
    }

    @javafx.fxml.FXML
    public void Bookingonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"bookingvacationpackages.fxml");
    }

    @javafx.fxml.FXML
    public void TravelAlertscustormeronclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"TrackingTravelAlert&OfferingCustomerService.fxml");
    }

    @javafx.fxml.FXML
    public void TravelInsuranceonclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent,"OfferingTravelInsurancetoConsumers.fxml");

    }
}
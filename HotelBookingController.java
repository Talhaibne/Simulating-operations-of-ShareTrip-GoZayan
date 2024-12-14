package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.io.IOException;

public class HotelBookingController {

    @FXML
    private ComboBox<String> hotelSelectionComboBox;
    @FXML
    private ComboBox<String> touristSpotComboBox;
    @FXML
    private RadioButton highRatingRadioButton;
    @FXML
    private RadioButton lowRatingRadioButton;
    @FXML
    private Label outputLabel;

    @FXML
    public void initialize() {
        hotelSelectionComboBox.getItems().addAll("Hotel Paradise",
                "Luxury Inn",
                "Budget Stay",
                "Seaside Resort",
                "Mountain Retreat");
        touristSpotComboBox.getItems().addAll("Cox's Bazar", "Sundarbans", "Srimangal", "Bandarban");
    }

    @FXML
    public void confirmButtonOnClick(ActionEvent actionEvent) {
        String selectedHotel = hotelSelectionComboBox.getValue();
        String selectedSpot = touristSpotComboBox.getValue();
        String ratingPreference = highRatingRadioButton.isSelected() ? "High Rating" :
                lowRatingRadioButton.isSelected() ? "Low Rating" : "No Preference";

        outputLabel.setText("Selected Hotel: " + selectedHotel + "\n" +
                "Tourist Spot: " + selectedSpot +
                "Rating : " + ratingPreference);

    }

    @FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "TravelAgentDashboard.fxml");
    }
}

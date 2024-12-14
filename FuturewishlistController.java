package com.example.gozyaan;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class FuturewishlistController {
    @javafx.fxml.FXML
    private ComboBox<String> dealComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> paymentComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> bookingComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        dealComboBox.getItems().addAll("Deal 1", "Deal 2", "Deal 3");
        paymentComboBox.getItems().addAll("Bkash", "Nagad", "Bank Transfer");
        bookingComboBox.getItems().addAll("Booking 1", "Booking 2", "Booking 3");


        dealComboBox.setValue("Select a deal");
        paymentComboBox.setValue("Select a payment method");
        bookingComboBox.setValue("Select a booking");
    }

    @javafx.fxml.FXML
    public void BackButtononClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "PassengerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void confirmButtonOnClick(ActionEvent actionEvent) {

        String selectedDeal = dealComboBox.getValue();
        String selectedPayment = paymentComboBox.getValue();
        String selectedBooking = bookingComboBox.getValue();


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Selection Confirmation");
        alert.setHeaderText("Your Selections");
        alert.setContentText(
                "Selected Deal: " + selectedDeal + "\n" +
                        "Selected Payment Method: " + selectedPayment + "\n" +
                        "Selected Booking: " + selectedBooking
        );
        alert.showAndWait();
    }
}

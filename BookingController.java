package com.example.gozyaan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class BookingController {

    @javafx.fxml.FXML
    private TableView<BookedPassengers> Table;
    @javafx.fxml.FXML
    private TableColumn<BookedPassengers, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<BookedPassengers, String> phoneColumn;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField phoneField;

    private ObservableList<BookedPassengers> passengersList;

    @javafx.fxml.FXML
    public void initialize() {

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));

        passengersList = FXCollections.observableArrayList();

        Table.setItems(passengersList);
    }

    @javafx.fxml.FXML
    public void BackButtononclick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene(actionEvent, "PassengerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void confrimButtonOnClick(ActionEvent actionEvent) {
        String name = nameField.getText();
        String phone = phoneField.getText();

        if (name.isEmpty() || phone.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(null);
            alert.setHeaderText("Error");
            alert.setContentText(
                    "Fields Cannot Be Empty"
            );
            alert.showAndWait();
        } else {
            BookedPassengers passenger = new BookedPassengers(name, phone);
            passengersList.add(passenger);
        }



        nameField.clear();
        phoneField.clear();
    }
}

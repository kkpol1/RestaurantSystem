package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class RestuarantMenuController {
    @FXML
    private Button entireMenu;

    @FXML
    private Button breakfast;

    @FXML
    private Button starters;

    @FXML
    private Button soups;

    @FXML
    private Button mainDishes;

    @FXML
    private Button drinks;

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
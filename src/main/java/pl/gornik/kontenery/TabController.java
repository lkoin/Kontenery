package pl.gornik.kontenery;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class TabController implements Initializable {


    @FXML
    private TabPane TabPane;

    @FXML
    private Tab TabPy1;

    @FXML
    private Label lblResult;

    @FXML
    private RadioButton rbPy1_1;

    @FXML
    private ToggleGroup pyt1;

    @FXML
    private RadioButton rbPy1_4;

    @FXML
    private RadioButton rbPy1_2;

    @FXML
    private RadioButton rbPy1_3;

    @FXML
    private Button btnConfirm1;

    @FXML
    private Tab tabPy2;

    @FXML
    private RadioButton rbPy2_1;

    @FXML
    private ToggleGroup pyt2;

    @FXML
    private RadioButton rbPy2_4;

    @FXML
    private RadioButton rbPy2_2;

    @FXML
    private RadioButton rbPy2_3;

    @FXML
    private Button btnConfirm2;

    @FXML
    private Tab tabResult;

    @FXML
    private Button btnCLose;

    public static int counter = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCLose.setOnAction(event -> Platform.exit());
        btnConfirm1.setOnAction(event -> {
            if (rbPy1_1.isSelected()) counter++;
            TabPy1.setDisable(true);
            tabPy2.setDisable(false);
        });
        btnConfirm2.setOnAction(event -> {
            if (rbPy2_3.isSelected()) counter++;
            tabPy2.setDisable(true);
            tabResult.setDisable(false);
            lblResult.setText("Wynik: " + counter);
        });
    }

    public void checkAnsewers(RadioButton radioOk) {
        if (radioOk.isSelected()) {
            counter++;
        }

    }
}

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConverterController
{
    @FXML private ComboBox conversionComboBox;

    private final String AREA        = "Area";
    private final String ENERGY      = "Energy";
    private final String FORCE       = "Force";
    private final String LENGTH      = "Length";
    private final String SPEED       = "Speed";
    private final String TEMPERATURE = "Temperature";
    private final String WEIGHT      = "Weight";

    @FXML public void handleConverterAction(ActionEvent event) throws IOException
    {
        this.conversionComboBox = (ComboBox) event.getSource();

        String type = (String) this.conversionComboBox.getValue();

        String fxmlFile = "conversionArea.fxml";
        switch(type)
        {
            case(AREA)       :fxmlFile = "converterArea.fxml";        break;
            case(ENERGY)     :fxmlFile = "converterEnergy.fxml";      break;
            case(FORCE)      :fxmlFile = "converterForce.fxml";       break;
            case(LENGTH)     :fxmlFile = "converterLength.fxml";      break;
            case(SPEED)      :fxmlFile = "converterSpeed.fxml";       break;
            case(TEMPERATURE):fxmlFile = "converterTemperature.fxml"; break;
            case(WEIGHT)     :fxmlFile = "converterWeight.fxml";      break;
        }

        Stage primaryStage = (Stage) this.conversionComboBox.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource(fxmlFile));
        Scene scene = new Scene(myPane);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}

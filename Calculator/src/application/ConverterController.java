package application;

import application.formatter.Formatter;
import application.formatter.Object;
import application.model.ConverterModel;
import application.model.ScientificModel;
import application.model.StatisticsModel;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConverterController
{
    @FXML private ComboBox  conversionComboBox;
    @FXML private ComboBox  fromComboBox;
    @FXML private ComboBox  toComboBox;
    @FXML private TextField fromTextField;
    @FXML private TextField toTextField;

    private final String AREA   = "Area";
    private final String ENERGY = "Energy";
    private final String FORCE  = "Force";
    private final String LENGTH = "Length";
    private final String SPEED  = "Speed";
    private final String TEMP   = "Temperature";
    private final String WEIGHT = "Weight";


    @FXML public void handleInputAction(Event event)
    {
        String current = (this.fromTextField  = ((TextField) event.getSource())).getText();

        if (current.equals(Object.EMPTY)) return;

        if (!Formatter.isDigit(current.substring(current.length() - 1, current.length())))
        {
            this.fromTextField.setText(current = Formatter.delete(current));
            this.fromTextField.positionCaret(current.length());
            if (current.equals(Object.EMPTY)) return;
        }

        // Get the type of conversion being performed.
        String typeOfConversion = (String) this.conversionComboBox.getValue();

        double number = Double.parseDouble(this.fromTextField.getText());
        String from   = (String) this.fromComboBox.getValue();
        String to     = (String) this.toComboBox.getValue();

        // Convert according to 'typeOfConversion'.
        double result = 0;
        switch (typeOfConversion)
        {
            case (AREA)  :result = ConverterModel.areaConverter  (number, from, to); break;
            case (ENERGY):result = ConverterModel.energyConverter(number, from, to); break;
            case (FORCE) :result = ConverterModel.forceConverter (number, from, to); break;
            case (LENGTH):result = ConverterModel.lengthConverter(number, from, to); break;
            case (SPEED) :result = ConverterModel.speedConverter (number, from, to); break;
            case (TEMP)  :result = ConverterModel.tempConverter  (number, from, to); break;
            case (WEIGHT):result = ConverterModel.weightConverter(number, from, to); break;
        }

        this.toTextField.setText(Double.toString(result));
    }

    @FXML public void handleConverterAction(ActionEvent event) throws IOException
    {
        this.conversionComboBox = (ComboBox) event.getSource();

        String type = (String) this.conversionComboBox.getValue();

        String fxmlFile = "conversionArea.fxml";
        switch(type)
        {
            case(AREA)  :fxmlFile = "converterArea.fxml";        break;
            case(ENERGY):fxmlFile = "converterEnergy.fxml";      break;
            case(FORCE) :fxmlFile = "converterForce.fxml";       break;
            case(LENGTH):fxmlFile = "converterLength.fxml";      break;
            case(SPEED) :fxmlFile = "converterSpeed.fxml";       break;
            case(TEMP)  :fxmlFile = "converterTemperature.fxml"; break;
            case(WEIGHT):fxmlFile = "converterWeight.fxml";      break;
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

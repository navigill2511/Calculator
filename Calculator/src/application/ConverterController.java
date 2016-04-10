package application;
import application.formatter.Formatter;
import application.formatter.Object;
import application.model.ConverterModel;
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

/***********************************************************************************************************************
 * Class ConverterController controlls the converter interface of the application. It is connected to the following
 * fxml files:
 *  converterArea.fxml, converterLength.fxml, converEnergy.fxml, converterForce.fxml, converterSpeed.fxml,
 *  converterTemperature.fxml, converterWeight.fxml
 *
 *  ConverterController sets the appropriate pane (from one of the above) depemnding on user selection of the comboBox.
 *  It also calls the appropriate methods in 'ConverterModel' class when a user inputs a value to be converted.
 ***********************************************************************************************************************/
public class ConverterController
{
    // Objects as in FXML files.
    @FXML private ComboBox  conversionComboBox;
    @FXML private ComboBox  fromComboBox;
    @FXML private ComboBox  toComboBox;
    @FXML private TextField fromTextField;
    @FXML private TextField toTextField;

    // As displayed in comboBox
    private final String AREA   = "Area";
    private final String ENERGY = "Energy";
    private final String FORCE  = "Force";
    private final String LENGTH = "Length";
    private final String SPEED  = "Speed";
    private final String TEMP   = "Temperature";
    private final String WEIGHT = "Weight";


    /**
     * Catches a 'keyReleased' event at the 'fromTextField'. Then depending on the values set at
     * 'fromComboBox' and 'toComboBox', appropriate method in ConverterController class is called
     * to perform the conversion and the result is displayed on the 'toTextField'.
     * @param event
     */
    @FXML public void handleInputAction(Event event)
    {
        // Get the number that is being converted.
        String current = (this.fromTextField  = ((TextField) event.getSource())).getText();

        // If the number is null, return.
        if (current.equals(Object.EMPTY)) return;

        // Check if the input entered is indeed a digit, if not delete the character.
        if (!Formatter.isDigit(current.substring(current.length() - 1, current.length())))
        {
            this.fromTextField.setText(current = Formatter.delete(current));
            this.fromTextField.positionCaret(current.length());
            if (current.equals(Object.EMPTY)) return;
        }

        // Get the type of conversion being performed.
        String typeOfConversion = (String) this.conversionComboBox.getValue();

        // Stored information needed.
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

        // Display the answer.
        this.toTextField.setText(Double.toString(result));
    }

    /**
     * This method is responsible for switching between different views. If a user clicks
     * on 'Energy' in the comboBox for example. The other elements are set accordingly.
     * @param event
     * @throws IOException
     */
    @FXML public void handleConverterAction(ActionEvent event) throws IOException
    {
        // Gat the source of this event and set it to the converversionComboBox.
        this.conversionComboBox = (ComboBox) event.getSource();
        String type = (String) this.conversionComboBox.getValue();

        // Set the file name appropriately.
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

        // Set the view according to the file name.
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

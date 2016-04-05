package application;

import application.formatter.Formatter;
import application.formatter.Object;
import application.model.StandardModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class StandardController
{
    @FXML private TextField standardTextField;  // TextField as defined in 'Standard.fxml'.
    private String output;                      // Output to be displayed in TextField.

    /**
     *
     */
    public StandardController()
    {
        this.output = Object.EMPTY;
    }

    /**
     * @param event
     */
    @FXML public void handleInputOperation(ActionEvent event)
    {
        // Get the button that caused the event.
        String button = ((Button)event.getSource()).getText();

        // Add the number to the output and display the output.
        this.standardTextField.setText(this.output = (this.output + button));
    }

    /**
     *
     */
    @FXML public void calculate()
    {
        // If either operator, operandOne or operandTwo are empty calculation can not be done.
        if (this.output.equals(Object.EMPTY)) return;

        String result = Formatter.round(Double.toString(StandardModel.evaluate(this.output)));
        this.standardTextField.setText(this.output = result);
    }

    /**
     *
     */
    @FXML public void negativePositive()
    {
        standardTextField.setText(this.output = Formatter.negativePositive(this.output));
    }

    /**
     *
     */
    @FXML public void clearScreen()
    {
        this.standardTextField.setText(this.output = Object.EMPTY);
    }

    /**
     *
     */
    @FXML public void decimal()
    {
        this.standardTextField.setText(this.output = Formatter.addDecimal(this.output));
    }
}

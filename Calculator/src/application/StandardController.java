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
    private final int MAX_DIGITS = 10;

    @FXML private TextField standardTextField;

    private String output = Object.EMPTY;
    private String operandOne;
    private String operandTwo;
    private String operator;

    private int counter = 0;

    /**
     *
     * @param event
     */
    @FXML
    public void operand(ActionEvent event)
    {
        // If the screen is full, return.
        if (this.counter >= MAX_DIGITS) return;

        // If this is the first digit, clear the textField.
        if (this.counter == 0) this.standardTextField.setText(this.output = Object.CLEAR);

        // Get the button that caused the event.
        Button button = (Button)event.getSource();

        // Add the number to the output and display the output.
        this.output = (this.output == null) ? button.getText() : (this.output + button.getText());
        this.standardTextField.setText(this.output);

        // Increment number of digits.
        counter++;
    }

    /**
     *
     * @param event
     */
    @FXML
    public void operator(ActionEvent event)
    {
        // If the output is empty, return.
        if (this.output.equals(Object.EMPTY)) return;

        // Get the operator that caused the event.
        this.operator = ((Button)event.getSource()).getText();

        // Get operand one.
        this.operandOne = this.output;

        // Clear output and textField.
        this.standardTextField.setText(this.output = Object.EMPTY);

        this.counter = 0;   // Empty counter.
    }

    @FXML
    public void calculate()
    {
        // If either operator, operandOne or operandTwo are empty calculation can not be done.
        if (operator.equals(Object.EMPTY) || operandOne.equals(Object.EMPTY) || output.equals(Object.EMPTY)) return;

        // Get the operand two.
        this.operandTwo = this.output;

        double operand_1 = Double.parseDouble(this.operandOne);
        double operand_2 = Double.parseDouble(this.operandTwo);
        double result    = 0;

        // Perform calculation according to the operator.
        switch (this.operator)
        {
            case (Object.ADD):       result = StandardModel.add      (operand_1, operand_2); break;
            case (Object.SUBTRACT):  result = StandardModel.subtract (operand_1, operand_2); break;
            case (Object.MULTIPLY):  result = StandardModel.multipy  (operand_1, operand_2); break;
            case (Object.DIVIDE):    result = StandardModel.divide   (operand_1, operand_2); break;
            case (Object.REMAINDER): result = StandardModel.remainder(operand_1, operand_2); break;
        }

        // Display the result to the textField.
        standardTextField.setText(this.output = Formatter.round(result, MAX_DIGITS));

        this.operandOne = Object.CLEAR;
        this.operandTwo = Object.CLEAR;
        this.counter    = 0;
    }

    @FXML
    public void negativePositive()
    {
        standardTextField.setText(this.output);
    }

    @FXML
    public void resetObjects()
    {
        this.operandOne = Object.EMPTY;
        this.operandTwo = Object.EMPTY;

        this.standardTextField.setText(this.output = Object.EMPTY);

        this.counter = 0;
    }

    @FXML
    public void decimal()
    {
        this.standardTextField.setText(this.output = Formatter.addDecimal(this.output));
        counter++;
    }
}

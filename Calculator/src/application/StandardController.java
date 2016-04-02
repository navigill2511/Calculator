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

    @FXML private Button button;
    @FXML private TextField standardTextField;

    private String output;
    private String operandOne;
    private String operandTwo;
    private String result;
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
        if (counter >= MAX_DIGITS) return;

        // Get the button that caused the event.
        button = (Button)event.getSource();

        // Add the number related to the button to the screen.
        output = (button.getText().equals(Object.DECIMAL)) ? Formatter.addDecimal(output):
                        (output == null) ? button.getText() : (output + button.getText());

        standardTextField.setText(this.output);

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
        // If the operand one is empty return.
        if (output.equals(Object.EMPTY)) return;

        // Get the operator that caused the event.
        button   = (Button)event.getSource();
        operator = button.getText();

        this.operandOne = this.output;
        this.output     = Object.EMPTY;
        standardTextField.setText(this.output);
    }

    @FXML
    public void calculate()
    {
        if (this.operator.equals(Object.EMPTY) || this.operandOne.equals(Object.EMPTY)) return;

        if (this.output.equals(Object.EMPTY)) return;

        this.operandTwo = this.output;

        double operand_1 = Double.parseDouble(this.operandOne);
        double operand_2 = Double.parseDouble(this.operandTwo);
        double result = 0;
        switch (this.operator)
        {
            case (Object.ADD):       result = StandardModel.add      (operand_1, operand_2); break;
            case (Object.SUBTRACT):  result = StandardModel.subtract (operand_1, operand_2); break;
            case (Object.MULTIPLY):  result = StandardModel.multipy  (operand_1, operand_2); break;
            case (Object.DIVIDE):    result = StandardModel.divide   (operand_1, operand_2); break;
            case (Object.REMAINDER): result = StandardModel.remainder(operand_1, operand_2); break;
        }

        this.result = Formatter.round(result, MAX_DIGITS);

        standardTextField.setText(this.result);
        resetObjects();
    }

    @FXML
    public void format(ActionEvent event)
    {
        button = (Button) event.getSource();

        if (button.getText().equals(Object.AC)) resetObjects();

        //if (button.getText() == Object.)

        standardTextField.setText(this.output);
    }

    private void resetObjects()
    {
        this.output = Object.EMPTY;
        this.operandOne = Object.EMPTY;
        this.operandTwo = Object.EMPTY;
        this.counter = 0;
    }
}

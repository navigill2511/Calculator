package application;

import application.formatter.Formatter;
import application.formatter.Object;
import application.model.ScientificModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ScientificController
{
    @FXML private TextField scientificTextField;

    private String output = Object.EMPTY;
    private String operation = Object.EMPTY;
    private String number = Object.EMPTY;

    @FXML public void numpad(ActionEvent event)
    {
        // Get the button on the number pad that caused this event.
        Button button = (Button) event.getSource();

        // Get the text of the button and add it to the screen.
        this.number += button.getText();
        this.scientificTextField.setText(this.output += button.getText());
    }

    @FXML public void calculate()
    {
        double result = ScientificModel.evaluate(this.number);

        if (!this.operation.equals(Object.EMPTY))
        {
            switch (this.operation)
            {
                case (Object.SIN)          : result = ScientificModel.sin(result);     break;
                case (Object.COS)          : result = ScientificModel.cos(result);     break;
                case (Object.TAN)          : result = ScientificModel.tan(result);     break;
                case (Object.INV_SIN)      : result = ScientificModel.invSin(result);  break;
                case (Object.INV_COS)      : result = ScientificModel.invCos(result);  break;
                case (Object.INV_TAN)      : result = ScientificModel.invTan(result);  break;
                case (Object.SINH)         : result = ScientificModel.sinh(result);    break;
                case (Object.COSH)         : result = ScientificModel.cosh(result);    break;
                case (Object.TANH)         : result = ScientificModel.tanh(result);    break;
                case (Object.INV_SINH)     : result = ScientificModel.invSinh(result); break;
                case (Object.INV_COSH)     : result = ScientificModel.invCosh(result); break;
                case (Object.INV_TANH)     : result = ScientificModel.invTanh(result); break;
                case (Object.LOG)          : result = ScientificModel.log(result);     break;
                case (Object.LOG_TWO)      : result = ScientificModel.log2(result);    break;
                case (Object.LN)           : result = ScientificModel.ln(result);      break;
                case (Object.SQUARE_ROOT)  : result = ScientificModel.sqrt(result);    break;
                case (Object.CUBE_ROOT)    : result = ScientificModel.cbrt(result);    break;
                case (Object.SQUARED)      : result = ScientificModel.square(result);  break;
                case (Object.CUBED)        : result = ScientificModel.cube(result);    break;
                case (Object.EXPONENT)     : result = ScientificModel.eToThePower(result);   break;
                case (Object.TO_POWER_TEN) : result = ScientificModel.tenToThePower(result); break;
            }
        }

        this.scientificTextField.setText(this.output = Double.toString(result));
        this.output = this.number = this.operation = Object.CLEAR;

    }

    @FXML public void clearScreen()
    {
        this.output = this.number = this.operation = Object.EMPTY;
        this.scientificTextField.setText(this.output);
    }

    @FXML public void format(ActionEvent event)
    {

        Button button = (Button) event.getSource();
        if (button.getText().equals(Object.PLUS_MINUS))
        {
            this.scientificTextField.setText(this.output = Formatter.negativePositive(this.output));
        }

        if (button.getText().equals(Object.LEFT_PARENTHESIS))
        {
            this.scientificTextField.setText(this.output = Formatter.addLeftParenthesis(this.output));
        }

        if (button.getText().equals(Object.RIGHT_PARENTHESIS))
        {
            this.scientificTextField.setText(this.output = Formatter.addRightParenthesis(this.output));
        }

        if (button.getText().equals(Object.DELETE))
        {
            this.scientificTextField.setText(this.output = Formatter.delete(this.output));
        }

        if (button.getText().equals(Object.RADIANS))
        {
            ScientificModel.rad = true;
        }

        if (button.getText().equals(Object.DEGREES))
        {
            ScientificModel.rad = false;
        }
    }

    @FXML public void trignometry(ActionEvent event)
    {
        Button button = (Button) event.getSource();

        this.output = (this.operation = button.getText()) + Object.LEFT_PARENTHESIS;

        this.scientificTextField.setText(this.output);
    }

    @FXML public void handlePowerOperation(ActionEvent event)
    {
        // Get the button responsible for this operation.
        String operation = ((Button) event.getSource()).getText();

        if (this.output.length() > 1 && (this.output.charAt(this.output.length() - 2)  + "").equals(Object.POWER))
        {
            this.output = Formatter.surroundWithParenthesis(this.output);
        }

        // Set the operation according to the operation.
        if (operation.equals(Object.SQUARED)) this.operation = Object.POWER + Object.SQUARE;
        if (operation.equals(Object.CUBED))   this.operation = Object.POWER + Object.CUBE;
        if (operation.equals(Object.POWER_N)) this.operation = Object.POWER;

        this.scientificTextField.setText(this.output += this.operation);
    }

    @FXML public void handleExponentOperation(ActionEvent event)
    {
        // Get the button responsible for this operation.
        String operation = ((Button) event.getSource()).getText();

        if (operation.equals(Object.TO_POWER_TEN)) this.operation = Object.TEN + Object.POWER;
        if (operation.equals(Object.EXPONENT)) this.operation = Object.E + Object.POWER;

        this.scientificTextField.setText(this.output += this.operation);
    }

    @FXML public void handleLogOperation(ActionEvent event)
    {
        // Get the button responsible for this operation.
        String operation = ((Button) event.getSource()).getText();

        if (operation.equals(Object.LOG)) this.operation = Object.LOG + Object.LEFT_PARENTHESIS;
        if (operation.equals(Object.LN)) this.operation = Object.LN + Object.LEFT_PARENTHESIS;
        if (operation.equals(Object.LOG_TWO)) this.operation = Object.LOG_TWO + Object.LEFT_PARENTHESIS;

        this.scientificTextField.setText(this.output += this.operation);
    }
}
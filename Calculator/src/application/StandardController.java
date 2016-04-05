package application;
import application.formatter.Formatter;
import application.formatter.Object;
import application.model.StandardModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/***********************************************************************************************************************
 * Class StandardController controls the operations in standard view of the calculator.
 * The standard view is created by 'standard.fxml'
 * This class controls what is displayed on the TextField and evaluates the expressions using StandardModel class.
 *
 ***********************************************************************************************************************/
public class StandardController
{
    @FXML private TextField standardTextField;  // TextField as defined in 'Standard.fxml'.
    private String output;                      // Output to be displayed in TextField.

    /**
     * Constructor assigns an empty string to 'output'.
     */
    public StandardController()
    {
        this.output = Object.EMPTY;
    }

    /**
     * On click of a number or operator button, this method is called.
     * It adds the new object to the text field.
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
     * When equal (=) is pressed, this method is called.
     * It evaluates the expression in the TextField and displays the result.
     */
    @FXML public void calculate()
    {
        this.output = this.standardTextField.getText();

        // If either operator, operandOne or operandTwo are empty calculation can not be done.
        if (this.output.equals(Object.EMPTY)) return;

        // Get the formatted result.
        String result = Formatter.round(Double.toString(StandardModel.evaluate(this.output)));

        // Display the result.
        this.standardTextField.setText(this.output = result);
    }

    /**
     * Adds or removes a negative. This method is called when '+/-' is pressed.
     */
    @FXML public void negativePositive()
    {
        standardTextField.setText(this.output = Formatter.negativePositive(this.output));
    }

    /**
     * Clears the TextField. This method is called when 'AC' is pressed.
     */
    @FXML public void clearScreen()
    {
        this.standardTextField.setText(this.output = Object.EMPTY);
    }

    /**
     * Adds a decimal to the number. This method is called when '.' is pressed.
     */
    @FXML public void decimal()
    {
        this.standardTextField.setText(this.output = Formatter.addDecimal(this.output));
    }

}

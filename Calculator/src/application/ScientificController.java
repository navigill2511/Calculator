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

    @FXML
    public void numpad(ActionEvent event)
    {
        // Get the button on the number pad that caused this event.
        Button button = (Button) event.getSource();

        // Get the text of the button and add it to the screen.
        this.output = (this.output.equals(Object.EMPTY)) ? button.getText() : this.output + button.getText();
        this.scientificTextField.setText(this.output);
    }

    @FXML
    public void calculate()
    {
        this.output = Integer.toString(ScientificModel.evaluate(this.output));
        this.scientificTextField.setText(this.output);
        this.output = Object.CLEAR;
    }

    @FXML
    public void clearScreen()
    {
        this.scientificTextField.setText(this.output = Object.EMPTY);
    }

    @FXML
    public void format(ActionEvent event)
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
    }
}

package application;

import application.formatter.Formatter;
import application.formatter.Object;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

/***********************************************************************************************************************
 * Created by Navi on 29/03/2016.
 *
 * Class StandardDeviationController
 *
 * Controlls the I/O operations at the standard deviation window of the application. This class uses the
 * StatisticsModel class to do its calculations.
 ***********************************************************************************************************************/
public class StandardDeviationController
{
    // Text to guide the user on how to enter input.
    private final String HELP  = "Enter data separated by \",\" or space.\n"+
                                 "   For example: \"12, 22, 53, 34, 53\"   ";

    // Holds the above text.
    @FXML private Label helpLabel;

    // Inputs
    @FXML private TextArea stdDevTextArea;
    private String data;    // Data from input textField.

    // Outputs
    @FXML private TextField count;
    @FXML private TextField sum;
    @FXML private TextField mean;
    @FXML private TextField stdDev;

    /**
     * Fills 'this.data' and guides the user to input correct values into the textArea.
     * Listeners: onKeyReleased, onKeyPressed.
     * @param event
     */
    @FXML public void handleInputAction(Event event)
    {
        // Get the TextArea.
        this.data = ((TextArea) event.getSource()).getText();

        // If textArea is empty, return.
        if (this.data.equals(Object.EMPTY)) return;

        // Get the current character entered that caused this operation.
        String current = this.data.substring(this.data.length() - 1, this.data.length());

        // Check if this character is a valid input, if not delete itdeom the data.
        if (!validInput(current)) this.data = Formatter.delete(this.data);

        // Set the data in the textArea to the updated text.
        this.stdDevTextArea.setText(this.data);

        // Position the caret to the end of the data in the textArea.
        this.stdDevTextArea.positionCaret(this.data.length());
    }

    /**
     * When calculate is pressed, calculate the result and display it.
     */
    @FXML public void calculate()
    {
        // Convert string data to an ArrayList of doubles.
        ArrayList<Double> dataArrayList = Formatter.toDouble(Formatter.toArrayList(this.data));

        // Get the answers.
        double count  = dataArrayList.size();
        double sum    = StatisticsModel.sum(dataArrayList);
        double mean   = StatisticsModel.mean(sum, count);
        double stdDev = StatisticsModel.standardDeviation(dataArrayList, count, mean);

        // Display the answers.
        this.count.setText(Double.toString(count));
        this.sum.setText(Double.toString(sum));
        this.mean.setText(Double.toString(mean));
        this.stdDev.setText(Double.toString(stdDev));

    }

    /**
     * Displays the help text when user clicks the textArea.
     * Listener: onMouseKlicked
     */
    @FXML public void handleHelpAction()
    {
        this.helpLabel.setText(HELP);
    }

    /**
     * Determines weather a given character can be considered as a valid input.
     * Only digits, comma, space and newline is valid.
     * @param input
     * @return
     */
    private boolean validInput(String input)
    {
        return (input.equals("0") || input.equals("1") || input.equals("2") || input.equals("3") ||
                input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") ||
                input.equals("8") || input.equals("9") || input.equals(",") || input.equals(".") ||
                input.equals(" ") || input.equals("\n"));
    }
}

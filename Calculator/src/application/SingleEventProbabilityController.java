package application;
import application.formatter.Object;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/***********************************************************************************************************************
 * Created by Navi on 29/03/2016.
 *
 * Class SingleEventProbailityController
 *
 * Controlls the I/O operations at the single event window of the application. This class uses StatisticsModel
 * to perform calcualtions.
 ***********************************************************************************************************************/
public class SingleEventProbabilityController
{
    // Inputs
    String numberOfOccurrences;
    String numberOfOutcomes;

    // Output textField.
    @FXML TextField singleEventProbability;

    /**
     * Constructor declares inputs as empty first.
     */
    public SingleEventProbabilityController()
    {
        this.numberOfOccurrences = Object.EMPTY;
        this.numberOfOutcomes = Object.EMPTY;
    }

    /**
     * Sets the 'numberOfOccurences' when a value is inputted into the textfield.
     * Listeners: onKeyListener, onKeyPressedListener
     * @param event
     */
    @FXML public void handleOccurrenceOperation(Event event)
    {
        this.numberOfOccurrences = ((TextField) event.getSource()).getText();
    }

    /**
     * Sets the 'numberOfOutcomes' when a value is inputted into the textfield.
     * Listeners: onKeyListener, onKeyPressedListener
     * @param event
     */
    @FXML public void handleOutcomeOperation(Event event)
    {
        this.numberOfOutcomes = ((TextField) event.getSource()).getText();
    }

    /**
     * Calculates the answer and displays it to the output textField.
     */
    @FXML public void calculate()
    {
        // If the inputs are empty, return.
        if (this.numberOfOccurrences.equals(Object.EMPTY)
                || this.numberOfOutcomes.equals(Object.EMPTY)) return;

        // Convert inputs to doubles from strings.
        double occurrences = Double.parseDouble(this.numberOfOccurrences);
        double outcomes    = Double.parseDouble(this.numberOfOutcomes);

        // Find the result.
        String result   = Double.toString(StatisticsModel.singleEventProbability(occurrences, outcomes));

        // Display the result.
        this.singleEventProbability.setText(result);
    }
}

package application;
import application.formatter.Object;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/***********************************************************************************************************************
 * Created by Navi on 29/03/2016.
 *
 * Class MultipleEventProbabilityController controls the multipleEventProbability.fxml class. This class handles
 * inputs into the textFields, calculations and outputs to the textFields.
 ***********************************************************************************************************************/
public class MultipleEventProbabilityController
{
    private String possibleOutcomes;    // All possible outcomes.
    private String OccurrencesInA;      // A
    private String OccurrencesInB;      // B

    // Objects as in the fxml file.
    @FXML TextField probabilityA;
    @FXML TextField probabilityB;
    @FXML TextField probabilityA_and_B;
    @FXML TextField probabilityA_or_B;

    /**
     * Constructor, decpares empty objects.
     */
    public MultipleEventProbabilityController()
    {
        this.possibleOutcomes = Object.EMPTY;
        this.OccurrencesInA   = Object.EMPTY;
        this.OccurrencesInB   = Object.EMPTY;
    }

    /**
     * Handles input into the "possible outcomes" textfield. Catch keyReleased event
     * Saves the input into a variable.
     * @param event
     */
    @FXML public void handleOutcomeEvent(Event event)
    {
        this.possibleOutcomes = ((TextField) event.getSource()).getText();
    }

    /**
     * Handles input into the "occurrences A" textField. Catch keyReleased event
     * Saves the input into a variable.
     * @param event
     */
    @FXML public void handleOccurrenceAEvent(Event event)
    {
        this.OccurrencesInA = ((TextField) event.getSource()).getText();
    }

    /**
     * Handles input into the "occurrences B" textField. Catch keyReleased event
     * Saves the input into a variable.
     * @param event
     */
    @FXML public void handleOccurrenceBEvent(Event event)
    {
        this.OccurrencesInB = ((TextField) event.getSource()).getText();
    }

    /**
     * Performs the calculations to find P(A), P(B), P(A and B), P(A or B)
     */
    @FXML public void calculate()
    {
        // If the inputs are empty, return.
        if (this.possibleOutcomes.equals(Object.EMPTY) ||
            this.OccurrencesInA.equals(Object.EMPTY)   ||
            this.OccurrencesInB.equals(Object.EMPTY)) return;

        // Parse inputs to double.
        double occurrencesInA = Double.parseDouble(this.OccurrencesInA);
        double occurrencesInB = Double.parseDouble(this.OccurrencesInB);
        double outcomes       = Double.parseDouble(this.possibleOutcomes);

        // Get the answers.
        double probabilityOfA       = StatisticsModel.singleEventProbability(occurrencesInA, outcomes);
        double probabilityOfB       = StatisticsModel.singleEventProbability(occurrencesInB, outcomes);
        double probabilityOfA_and_B = StatisticsModel.A_and_B_probability(occurrencesInA, occurrencesInB, outcomes);
        double probabilityOfA_or_B  = StatisticsModel.A_or_B_Probability(occurrencesInA, occurrencesInB, outcomes);

        // Display the outputs.
        this.probabilityA.setText(Double.toString(probabilityOfA));
        this.probabilityB.setText(Double.toString(probabilityOfB));
        this.probabilityA_and_B.setText(Double.toString(probabilityOfA_and_B));
        this.probabilityA_or_B.setText(Double.toString(probabilityOfA_or_B));
    }

}

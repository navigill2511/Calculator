package application;
import application.formatter.Object;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Navi on 29/03/2016.
 */
public class SingleEventProbabilityController
{
    @FXML TextField singleEventProbability;
    String numberOfOccurrences;
    String numberOfOutcomes;

    public SingleEventProbabilityController()
    {
        this.numberOfOccurrences = Object.EMPTY;
        this.numberOfOutcomes = Object.EMPTY;
    }

    @FXML public void handleOccurrenceOperation(Event event)
    {
        this.numberOfOccurrences = ((TextField) event.getSource()).getText();
    }

    @FXML public void handleOutcomeOperation(Event event)
    {
        this.numberOfOutcomes = ((TextField) event.getSource()).getText();
    }

    @FXML public void calculate()
    {
        if (this.numberOfOccurrences.equals(Object.EMPTY)
                || this.numberOfOutcomes.equals(Object.EMPTY)) return;

        double occurrences = Double.parseDouble(this.numberOfOccurrences);
        double outcomes    = Double.parseDouble(this.numberOfOutcomes);
        String result   = Double.toString(StatisticsModel.singleEventProbability(occurrences, outcomes));

        this.singleEventProbability.setText(result);
    }
}

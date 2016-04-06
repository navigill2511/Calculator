package application;

import application.formatter.Object;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Navi on 29/03/2016.
 */
public class MultipleEventProbabilityController
{
    String possibleOutcomes;
    String OccurrencesInA;
    String OccurrencesInB;

    @FXML TextField probabilityA;
    @FXML TextField probabilityB;
    @FXML TextField probabilityA_and_B;
    @FXML TextField probabilityA_or_B;

    public MultipleEventProbabilityController()
    {
        this.possibleOutcomes = Object.EMPTY;
        this.OccurrencesInA   = Object.EMPTY;
        this.OccurrencesInB   = Object.EMPTY;
    }

    @FXML public void handleOutcomeEvent(Event event)
    {
        this.possibleOutcomes = ((TextField) event.getSource()).getText();
    }

    @FXML public void handleOccurrenceAEvent(Event event)
    {
        this.OccurrencesInA = ((TextField) event.getSource()).getText();
    }

    @FXML public void handleOccurrenceBEvent(Event event)
    {
        this.OccurrencesInB = ((TextField) event.getSource()).getText();
    }

    @FXML public void calculate()
    {
        if (this.possibleOutcomes.equals(Object.EMPTY) ||
            this.OccurrencesInA.equals(Object.EMPTY)   ||
            this.OccurrencesInB.equals(Object.EMPTY)) return;

        double occurrencesInA = Double.parseDouble(this.OccurrencesInA);
        double occurrencesInB = Double.parseDouble(this.OccurrencesInB);
        double outcomes       = Double.parseDouble(this.possibleOutcomes);

        double probabilityOfA       = StatisticsModel.singleEventProbability(occurrencesInA, outcomes);
        double probabilityOfB       = StatisticsModel.singleEventProbability(occurrencesInB, outcomes);
        double probabilityOfA_and_B = StatisticsModel.A_and_B_probability(occurrencesInA, occurrencesInB, outcomes);
        double probabilityOfA_or_B  = StatisticsModel.A_or_B_Probability(occurrencesInA, occurrencesInB, outcomes);

        System.out.println(probabilityOfA + " " + probabilityOfB);

        this.probabilityA.setText(Double.toString(probabilityOfA));
        this.probabilityB.setText(Double.toString(probabilityOfB));
        this.probabilityA_and_B.setText(Double.toString(probabilityOfA_and_B));
        this.probabilityA_or_B.setText(Double.toString(probabilityOfA_or_B));
    }

}

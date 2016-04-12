package application;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.math.BigInteger;

/***********************************************************************************************************************
 * Created by Navi on 29/03/2016.
 *
 * Class PermutationCombinationController controlls the I/O operations at the Permutation/Combination window.
 * It uses StatisticsModel class to perform related calculations.
 ***********************************************************************************************************************/
public class PermutationCombinationController
{
    String n, r;    // To store inputs to TextFields.

    // Outputs
    @FXML TextField permutationTextField;
    @FXML TextField combinationTextField;

    /**
     * Sets the value of 'this.n' when user inputs a value into the TextField.
     * A onKeyRelease and onKeyPressed listeners are used to listen for action.
     * @param event
     */
    @FXML public void handleNAction(Event event)
    {
        this.n = ((TextField)event.getSource()).getText();
    }

    /**
     * Sets the value of 'this.r' when user inputs a value into the TextField.
     * A onKeyRelease and onKeyPressed listeners are used to listen for action.
     * @param event
     */
    @FXML public void handleRAction(Event event)
    {
        this.r = ((TextField) event.getSource()).getText();
    }

    /**
     * When "Calculate" button is pressed, this method is tun to calculate.
     */
    @FXML public void calculate()
    {
        // If the inputs required are empty, return.
        if (this.n == null || this.r == null) return;

        // Convert input strings to numbers.
        // BigInteger is used, because calculating factorials gives huge numbers.
        BigInteger n = new BigInteger(this.n);
        BigInteger r = new BigInteger(this.r);

        // Calculate the answers and diplay them to the output TextFields.
        this.permutationTextField.setText(StatisticsModel.permutation(n, r).toString());
        this.combinationTextField.setText(StatisticsModel.combination(n, r).toString());
    }
}

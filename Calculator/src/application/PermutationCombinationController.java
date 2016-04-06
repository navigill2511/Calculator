package application;
import application.model.StatisticsModel;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.math.BigInteger;

/**
 * Created by Navi on 29/03/2016.
 */
public class PermutationCombinationController
{
    String n, r;
    @FXML TextField permutationTextField;
    @FXML TextField combinationTextField;

    @FXML public void handleNAction(Event event)
    {
        this.n = ((TextField)event.getSource()).getText();
    }

    @FXML public void handleRAction(Event event)
    {
        this.r = ((TextField) event.getSource()).getText();
    }

    @FXML public void calculate()
    {
        System.out.println(this.n + "C" + this.r);

        if (this.n == null || this.r == null) return;
        BigInteger n = new BigInteger(this.n);
        BigInteger r = new BigInteger(this.r);
        this.permutationTextField.setText(StatisticsModel.permutation(n, r).toString());
        this.combinationTextField.setText(StatisticsModel.combination(n, r).toString());
    }
}

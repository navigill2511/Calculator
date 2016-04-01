package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StandardController
{
    private final String CLEAR  = "";
    private final String EMPTY  = "";
    private final String EQUALS = "=";

    private final String ADD       = "+";
    private final String SUBTRACT  = "-";
    private final String DIVIDE    = "/";
    private final String MULTIPLY  = "X";
    private final String REMAINDER = "%";

    @FXML private Button button;
    @FXML private TextField standardTextField;

    private String output;
    private double operandOne;
    private double operandTwo;
    private String operator;

    private StandardScientificModel model;

    public StandardController()
    {
        this.model = new StandardScientificModel();
    }

    /**
     *
     * @param event
     */
    @FXML
    public void number(ActionEvent event)
    {
        button = (Button)event.getSource();

        output = (output == null) ? button.getText() : (output + button.getText());

        standardTextField.setText(output);
    }

    /**
     *
     * @param event
     */
    @FXML
    public void operator(ActionEvent event)
    {
        button   = (Button)event.getSource();
       // temp     = output;
        output   = "";
        operator = button.getText();

        standardTextField.setText(output);


    }

    @FXML
    public String calculate(ActionEvent event)
    {
        if (this.operator.equals(EMPTY)) return CLEAR;

        double result = 0;
        switch (this.operator)
        {
            case (ADD):       result = model.add      (operandOne, operandTwo); break;
            case (SUBTRACT):  result = model.subtract (operandOne, operandTwo); break;
            case (MULTIPLY):  result = model.multipy  (operandOne, operandTwo); break;
            case (DIVIDE):    result = model.divide   (operandOne, operandTwo); break;
            case (REMAINDER): result = model.remainder(operandOne, operandTwo); break;
        }

        return Double.toString(result);
    }
}

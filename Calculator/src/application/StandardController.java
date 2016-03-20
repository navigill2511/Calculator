package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StandardController
{
    @FXML private Button button;
    @FXML private TextField standardTextField;

    private String output;
    private String temp;
    private String operator;

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
        temp     = output;
        output   = "";
        operator = button.getText();

        standardTextField.setText(output);


    }

    @FXML
    public void calculate(ActionEvent event)
    {

    }
}

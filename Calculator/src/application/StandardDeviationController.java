package application;

import application.formatter.Formatter;
import application.formatter.Object;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.util.ArrayList;

/**
 * Created by Navi on 29/03/2016.
 */
public class StandardDeviationController
{
    private final String ERROR = "Data must of integers or decimals separated by \",\" and a space\n"+
                                 "              For example: \"12, 22, 53, 34, 53\"                 ";

    @FXML private TextArea stdDevTextArea;
    @FXML private Label wrongInputLabel;
    private String data;

    @FXML public void handleInputAction(Event event)
    {
        this.data = ((TextArea) event.getSource()).getText();
        this.wrongInputLabel.setText("");

        if (this.data.equals(Object.EMPTY)) return;

        String current = this.data.substring(this.data.length() - 1, this.data.length());

       if (!validInput(current))
       {
           this.wrongInputLabel.setText(ERROR);
           this.data = Formatter.delete(this.data);
       }

        this.stdDevTextArea.setText(this.data);
        this.stdDevTextArea.positionCaret(this.data.length());
    }

    @FXML public void calculate()
    {
        ArrayList<String> dataArrayList = Formatter.toArrayList(this.data);

        for (String s : dataArrayList)
        {
            System.out.print(s + " ");
        }
    }

    private boolean validInput(String input)
    {
        return (input.equals("0") || input.equals("1") || input.equals("2") || input.equals("3") ||
                input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") ||
                input.equals("8") || input.equals("9") || input.equals(",") || input.equals(".") ||
                input.equals(" ") || input.equals("\n"));
    }
}

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Created by Navi on 19/03/2016.
 */
public class MenuController
{
    @FXML private MenuBar menuBar;

    @FXML
    public void handleStandardAction() throws IOException
    {
        System.out.println("Standard clicked!");

        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("standard.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);

    }

    @FXML
    public void handleScientificAction() throws IOException
    {
        System.out.println("Scientific clicked!");

        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("scientific.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);

    }

    @FXML
    public void handleConverterAction()
    {
        System.out.println("Converter clicked!");
    }

    private void addScene(Stage primaryStage, Scene scene)
    {
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}

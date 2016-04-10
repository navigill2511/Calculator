package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

/***********************************************************************************************************************
 * NavigationController class
 ***********************************************************************************************************************/
public class NavigationController
{
    @FXML private MenuBar menuBar;

    @FXML public void handleStandardAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("standard.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);

    }

    @FXML public void handleScientificAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("scientific.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);

    }

    @FXML public void handlePermCombAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("permutationCombination.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    @FXML public void handleSingleEventProbabilityAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("singleEventProbability.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    @FXML public void handleMultipleEventProbabilityAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("multipleEventProbability.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    @FXML public void handleStandardDeviationAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("standardDeviation.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    @FXML public void handleConverterAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("converterArea.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
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

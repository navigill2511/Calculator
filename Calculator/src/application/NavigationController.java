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
 *
 * When a user selects an item from the menu, this class sets the view appropriate to the item selected.
 ***********************************************************************************************************************/
public class NavigationController
{
    @FXML private MenuBar menuBar;  // navigation.fxml

    // "Standard" selected: Show standard window.
    @FXML public void handleStandardAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("standard.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // "Scientific" selected: Show scientific window.
    @FXML public void handleScientificAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("scientific.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // "Permutaion/Combination" selected: Show permutaion/combination window.
    @FXML public void handlePermCombAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("permutationCombination.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // "Single Event" selected: Show single event probability window.
    @FXML public void handleSingleEventProbabilityAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("singleEventProbability.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // "Multiple Event" selected: Show multiple event probability window.
    @FXML public void handleMultipleEventProbabilityAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("multipleEventProbability.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // "Standard Deviation" selected: Show standard diviation window.
    @FXML public void handleStandardDeviationAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("standardDeviation.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // "Standard" selected: Show standard window.
    @FXML public void handleConverterAction() throws IOException
    {
        Stage primaryStage = (Stage) menuBar.getScene().getWindow();
        Pane myPane = FXMLLoader.load(getClass().getResource("converterArea.fxml"));
        Scene scene = new Scene(myPane);
        addScene(primaryStage, scene);
    }

    // An internal method to build the stage for all the previous methods.
    private void addScene(Stage primaryStage, Scene scene)
    {
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}

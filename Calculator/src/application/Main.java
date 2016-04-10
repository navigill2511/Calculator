package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application
{
    /**
     * Sets the intial view of the window. It is set to the standard.fxml.
     * @param primaryStage
     * @throws IOException
     */
    @Override public void start(Stage primaryStage) throws IOException
    {
        Pane myPane = FXMLLoader.load(getClass().getResource("standard.fxml"));
        Scene scene = new Scene(myPane);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("EazyCalc");
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

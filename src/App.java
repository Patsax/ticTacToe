import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    {
        VBox vbox = new VBox(10);
        Scene scene = new Scene(vbox,640,480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Default");
        primaryStage.show();
    }

}

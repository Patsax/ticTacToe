import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    private InfoCenter infoCenter;

    @Override
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, UIConstants.APP_WIDTH, UIConstants.APP_HEIGHT);
        initLayout(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.show();
    }

    private void initLayout(BorderPane root) {
        initInfoCenter(root);
        initTileBoard(root);
    }

    private void initInfoCenter (BorderPane root){
        infoCenter = new InfoCenter();

        root.getChildren().add(infoCenter.getStackPane());
        
    }

    private void initTileBoard (BorderPane root){

    }

}

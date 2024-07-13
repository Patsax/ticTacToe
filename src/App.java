import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class App extends Application {

    private InfoCenter infoCenter;
    private TileBoard tileBoard;

    @Override

    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, UIConstants.APP_WIDTH, UIConstants.APP_HEIGHT);
            initLayout(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Tic-Tac-Toe");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initLayout(BorderPane root) {
        initInfoCenter(root);
        initTileBoard(root);
    }

    private void initInfoCenter (BorderPane root){
        infoCenter = new InfoCenter();
        infoCenter.setStartButtonOnAction(startNewGame());
        root.getChildren().add(infoCenter.getStackPane());
        
    }

    private EventHandler<ActionEvent> startNewGame() {
        return new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                infoCenter.hideStartButton();
                infoCenter.updateMessage("Player X Turn");
                tileBoard.startNewGame();
            }
        };
    }

    private void initTileBoard (BorderPane root){
        tileBoard = new TileBoard(infoCenter);
        root.getChildren().add(tileBoard.getStackPane());
    }

    public static void main(String[] args) {
        launch(args);
    }

}

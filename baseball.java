package baseball;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cchoi
 */
public class Baseball extends Application {
    
      @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("BaseballController.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Baseball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

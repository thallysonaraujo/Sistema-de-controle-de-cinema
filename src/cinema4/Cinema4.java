
package cinema4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.I;
import javafx.stage.Stage;



public class Cinema4 extends Application {
    
    
            
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLIngresso.fxml"));
        
        
      
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

        
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

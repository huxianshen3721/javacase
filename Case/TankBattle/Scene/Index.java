package Case.TankBattle.Scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author HuXianshen
 * @creat 2022-03-10:25
 */
public class Index {
    public static void load(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Index.class.getResource("/fxml/index.fxml"));
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

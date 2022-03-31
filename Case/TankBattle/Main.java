package Case.TankBattle;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-10:02
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Director.getInstance().init(primaryStage);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

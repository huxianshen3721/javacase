package Case.TankBattle;

import Case.TankBattle.Scene.Index;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-10:04
 */
public class Director {

    public static final double WIDTH = 960, HEIGHT = 640;

    private static Director instance = new Director();
    private Stage stage;

    private Director() {}

    public static Director getInstance() {
        return instance;
    }

    public void init(Stage stage) {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setTitle("坦克大战");
        stage.getIcons().add(new Image("image/logo.png"));
        stage.setResizable(false);
        stage.setScene(scene);
        this.stage = stage;
        toIndex();
        stage.show();
    }
    public void toIndex() {
        Index.load(stage);
    }
    public void gameOver() {

    }
    public void gameStart() {

    }

}

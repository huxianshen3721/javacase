package Case.TankBattle.Controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.awt.event.MouseEvent;

/**
 * @author HuXianshen
 * @creat 2022-03-10:40
 */
public class IndexController {
    @FXML
    private ImageView startGame;

    @FXML
    void mouseClickedStartGame(MouseEvent event) {

    }

    @FXML
    void mouseEnteredStartGame(MouseEvent event) {
        startGame.setOpacity(0.5);
    }

    @FXML
    void mouseExitedStartGame(MouseEvent event) {
        startGame.setOpacity(1);
    }
}

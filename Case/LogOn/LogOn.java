package Case.LogOn;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author HuXianshen
 * @creat 2022-03-12:12
 */

public class LogOn extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lName = new Label("账号");
        lName.setFont(Font.font(15));
        Label lPassword = new Label("密码");
        lPassword.setFont(Font.font(15));

        TextField tName = new TextField();
        tName.setTooltip(new Tooltip("请输入用户名"));
        PasswordField pPassword = new PasswordField();
        pPassword.setTooltip(new Tooltip("请输入密码"));

        tName.setUserData("Mercury");
        pPassword.setUserData(123456);

        Button login = new Button("登录");
        Button clear = new Button("清除");

        GridPane gr = new GridPane();
        gr.setStyle("-fx-background-color:#FFEBCD");
        gr.add(lName, 0, 0);
        gr.add(tName, 1, 0);
        gr.add(lPassword, 0, 1);
        gr.add(pPassword, 1, 1);
        gr.add(login, 1, 2);
        gr.add(clear, 0, 2);
        gr.setHgap(5);
        gr.setVgap(17);
        gr.setAlignment(Pos.CENTER);
        GridPane.setMargin(login, new Insets(0, 0, 0, 150));

        Scene scene = new Scene(gr);

        primaryStage.setScene(scene);
        primaryStage.setTitle("登录");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        primaryStage.show();

        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tName.setText("");
                pPassword.setText("");
            }
        });

        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = (String)tName.getUserData();
                int password = (int)pPassword.getUserData();

                if(name.equals(tName.getText()) && password == Integer.parseInt(pPassword.getText())) {
                    System.out.println("登录成功");

                    MyWindow window = new MyWindow();
                    primaryStage.close();
                }
                else {
                    System.out.println("登录失败");

                    primaryStage.setTitle("账号或密码错误");

                    FadeTransition fade = new FadeTransition();
                    fade.setDuration(Duration.seconds(0.5));
                    fade.setNode(gr);
                    fade.setFromValue(0);
                    fade.setToValue(1);

                    fade.play();
                }

            }
        });
    }
}

class MyWindow {
    private final Stage stage = new Stage();
    public MyWindow() {


        stage.show();
    }
}















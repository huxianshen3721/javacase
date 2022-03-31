package Case.Balance;

/**
 * @author HuXianshen
 * @creat 2022-02-18:27
 */

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

import static javafx.geometry.Pos.CENTER;

public class Balance extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lTitle = new Label("余额宝");
        lTitle.setFont(Font.font(40));
        lTitle.setTextFill(Color.WHITE);
        lTitle.setStyle("-fx-background-color:#FFA500");
        Label lName = new Label("用户号：");
        lName.setFont(Font.font(18));
        Label lPassword = new Label("密    码：");
        lPassword.setFont(Font.font(18));
        Label lCaptcha = new Label("验证码：");
        lCaptcha.setFont(Font.font(18));
        Label lMercury = new Label("技术支持—Mercury狐仙笙");
        lMercury.setFont(Font.font(10));
        lMercury.setTextFill(Color.DARKBLUE);

        TextField tName = new TextField();
        tName.setTooltip(new Tooltip("反正不可能是叶秋"));
        tName.setPromptText("请输入用户名");
        TextField tCaptcha = new TextField();
        tCaptcha.setTooltip(new Tooltip("愣怔干嘛，算不出来嘛？"));
        tCaptcha.setPromptText("验证码是1200*3+121");
        PasswordField pPassword = new PasswordField();
        pPassword.setTooltip(new Tooltip("总不能是7个7吧"));
        pPassword.setPromptText("请输入密码");

        Button login = new Button("登录");
        login.setTooltip(new Tooltip("我亦无他，唯钱盛尔~"));
        Button clear = new Button("清除");
        clear.setTooltip(new Tooltip("想好了再点嗷"));

        tName.setUserData("Mercury");
        pPassword.setUserData(7777777);
        tCaptcha.setUserData(3721);

        GridPane gr = new GridPane();
        gr.setStyle("-fx-background-color:#FFEBCD");
        gr.add(lTitle, 1, 0);
        gr.add(lName, 0, 1);
        gr.add(tName, 1, 1);
        gr.add(lPassword, 0, 2);
        gr.add(pPassword, 1, 2);
        gr.add(lCaptcha, 0, 3);
        gr.add(tCaptcha, 1, 3);
        gr.add(clear, 0, 4);
        gr.add(login, 1, 4);
        gr.add(lMercury, 1,44);
        gr.setHgap(5);
        gr.setVgap(5);
        gr.setAlignment(CENTER);
        GridPane.setMargin(login, new Insets(0, 0, 0, 170));
        GridPane.setMargin(lMercury, new Insets(0,0,0,100));
        GridPane.setMargin(lTitle, new Insets(20,0,50,15));
        Scene scene1 = new Scene(gr);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("余额宝");
        primaryStage.setWidth(320);
        primaryStage.setHeight(520);
        primaryStage.setResizable(false);
        //primaryStage.getIcons().add(new Image("image/hand.png"));
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene1);
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
                        primaryStage.setTitle("登录错误");
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

    public MyWindow() {
        double basicFunds = 0.0;
        double interestRate = 0.0;
        double totalFunds = 0.0;
        int day = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input basicFunds");
        basicFunds = scanner.nextDouble();
        System.out.println("Please input interestRate");
        interestRate = scanner.nextDouble();
        System.out.println("Please input day");
        day = scanner.nextInt();
        totalFunds = basicFunds * Math.pow((1 + interestRate), day);
        String ss = String.format("%.2f", totalFunds);

        Stage stage = new Stage();
        Label totalAmount = new Label("总金额（元）");
        totalAmount.setLayoutX(33);
        totalAmount.setLayoutY(30);
        totalAmount.setFont(Font.font(40));
        totalAmount.setTextFill(Color.WHITE);
        totalAmount.setStyle("-fx-background-color:#FF4500");
        Label lMercury = new Label("技术支持—Mercury狐仙笙");
        lMercury.setFont(Font.font(10));
        lMercury.setTextFill(Color.DARKBLUE);
        lMercury.setLayoutX(180);
        lMercury.setLayoutY(460);
        Label funds = new Label(String.valueOf(ss));
        funds.setLayoutX(10);
        funds.setLayoutY(100);
        funds.setMinSize(280, 50);
        funds.setFont(Font.font(40));
        funds.setAlignment(Pos.CENTER);
        Button add = new Button("转入");
        add.setMinSize(110, 30);
        add.setFont(Font.font(25));
        add.setTextFill(Color.WHITE);
        add.setStyle("-fx-background-color:#FF4500");
        add.setLayoutX(35);
        add.setLayoutY(200);
        Button reduce = new Button("转出");
        reduce.setMinSize(110, 30);
        reduce.setFont(Font.font(25));
        reduce.setTextFill(Color.WHITE);
        reduce.setStyle("-fx-background-color:#FF4500");
        reduce.setLayoutX(160);
        reduce.setLayoutY(200);
        Button website = new Button("点击进入网站");
        website.setMinSize(302,55);
        website.setLayoutY(400);
        website.setStyle("-fx-background-color:#2E8B57");

        add.setOnAction(event -> {
            System.out.println("Please input transfer in amount");
            double addFunds = scanner.nextDouble();
            System.out.println("addFunds = " + addFunds);
        });
        reduce.setOnAction(event -> {
            System.out.println("Please input transfer out amount");
            double reduceFunds = scanner.nextDouble();
            System.out.println("reduceFunds = " + reduceFunds);
        });
        website.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("www.baidu.com"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(totalAmount, funds, add, reduce, website, lMercury);
        Scene scene = new Scene(root, 320, 520);
        //scene.setCursor(new ImageCursor(new Image("image/p2.png")));

        stage.setScene(scene);

        stage.setTitle("余额宝");
        stage.setWidth(320);
        stage.setHeight(520);
        stage.setResizable(false);
        //stage.getIcons().add(new Image("image/logo.png"));
        stage.initStyle(StageStyle.DECORATED);
        stage.show();

    }

}
























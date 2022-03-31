package Case.GreedySnake;

/**
 * @author HuXianshen
 * @creat 2022-03-20:18
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SnakeFrame extends JFrame{
    public static SnakeBoard snakeboard;
    public SnakeFrame(String title){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(title);
        setVisible(true);
        setLocationRelativeTo(null);
        snakeboard = new SnakeBoard();
        add(snakeboard);
        pack();
        addKeyListener(new keylistener());
    }

    public static void main(String[] args) throws InterruptedException {
        SnakeFrame snakeframe = new SnakeFrame("java贪吃蛇");
        game();
    }

    public class keylistener implements KeyListener{
        public void keyTyped(KeyEvent e) {
        }
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_DOWN:
                    if(snakeboard.way!=4)snakeboard.way = 2;
                    break;
                case KeyEvent.VK_UP:
                    if(snakeboard.way!=2)snakeboard.way = 4;
                    break;
                case KeyEvent.VK_LEFT:
                    if(snakeboard.way!=1)snakeboard.way = 3;
                    break;
                case KeyEvent.VK_RIGHT:
                    if(snakeboard.way!=3)snakeboard.way = 1;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        public void keyReleased(KeyEvent e) {
        }
    }

    public static void game() throws InterruptedException{
        while(true) {
            Thread.sleep(100);
            if(snakeboard.way == 1)snakeboard.snake_x+=1;
            if(snakeboard.way == 2)snakeboard.snake_y+=1;
            if(snakeboard.way == 3)snakeboard.snake_x-=1;
            if(snakeboard.way == 4)snakeboard.snake_y-=1;
            if(snakeboard.board[snakeboard.snake_x][snakeboard.snake_y]>0 || snakeboard.snake_x<1 || snakeboard.snake_y >60)System.exit(0);
            snakeboard.board[snakeboard.snake_x][snakeboard.snake_y] = snakeboard.snake_lon;
            if ((snakeboard.snake_x == snakeboard.food_x) && (snakeboard.snake_y == snakeboard.food_y)) {
                snakeboard.snake_lon += 1;
                while (snakeboard.board[snakeboard.food_x][snakeboard.food_y] != 0) {
                    snakeboard.food_x = (int)Math.round(Math.random()*59)+1;
                    snakeboard.food_y = (int)Math.round(Math.random()*39)+1;
                }
            }
            snakeboard.board[snakeboard.food_x][snakeboard.food_y] = -1;
            snakeboard.draw();
        }
    }
}

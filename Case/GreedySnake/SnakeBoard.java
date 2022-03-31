package Case.GreedySnake;

import javax.swing.*;

/**
 * @author HuXianshen
 * @creat 2022-03-20:21
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class SnakeBoard extends JComponent {
    public int snake_lon = 3;
    public int[][] board = new int[62][42];
    public int food_x;
    public int food_y;
    public int snake_x = 10;
    public int snake_y = 10;
    public int size = 10;
    public int way = 1;
    public SnakeBoard() {
        food_x = (int)Math.round(Math.random()*59)+1;
        food_y = (int)Math.round(Math.random()*39)+1;
        board[food_x][food_y]=-1;

    }

    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 1;i<=60;i++) {
            for(int j = 1;j<=40;j++) {
                if(board[i][j]==0) continue;
                if(board[i][j]>0) {
                    board[i][j]-=1;
                    g.setColor(Color.green);
                    g.fillRect((i-1)*size, (j-1)*size, size, size);
                }
                else {
                    g.setColor(Color.red);
                    g.fillRect((i-1)*size, (j-1)*size, size, size);
                }
            }
        }
    }


    public void draw() {
        repaint();
    }

    public Dimension getPreferredSize() {
        return new Dimension(600,400);
    }
}

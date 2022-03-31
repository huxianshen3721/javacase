package Case.SupperMarie;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/**
 * @author HuXianshen
 * @creat 2022-03-13:04
 */
public class MyFrame extends JFrame implements KeyListener {
    public MyFrame() throws IOException {
        //size
        this.setSize(800,600);
        //center display
        this.setLocationRelativeTo(null);
        //windows visible
        this.setVisible(true);
        //close key
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //the size can not be changed
        this.setResizable(false);
        //add keyboard monitor
        this.addKeyListener(this);
        //title
        this.setTitle("Super Marie");
        StaticValue.init();
    }

    public static void main(String[] args) throws IOException {
        MyFrame myFrame = new MyFrame();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

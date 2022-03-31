package Case.PlaneBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author HuXianshen
 * @creat 2022-03-21:28
 */
//public class GamePanel extends JPanel {
//    BufferedImage bg;
//    Hero hero = new Hero();
//    List<Ep>eps = new ArrayList<EP>();
//    List<Fire>fs = new ArrayList<Fire>();
//
//    public void action() {
//        new Thread() {
//            @Override
//            public void run() {
//                while(true) {
//                    epEnter();
//                    epMove();
//                    shoot();
//                    fireMove();
//                    shoot();
//                    fireMove();
//                    shootEp();
//                    try {
//                        Thread.sleep(30);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    repaint();
//                }
//            }
//        }.start();
//    }
//    protected  void shootEp() {
//        for(int i = 0; i < fs.size(); i++) {
//            Fire f = fs.get(i);
//            bang(f);
//        }
//    }
//    private void bang(Fire f) {
//        for(int i = 0; i < eps.size(); i++) {
//            Ep e = eps.get(i);
//            if(e.shootBy(f)) {
//                eps.remove(e);
//                fs.remove(f);
//            }
//        }
//    }
//    protected  void fireMove() {
//        for(int i = 0; i < fs.size(); i++) {
//            Fire f = fs.get(i);
//            f.move();
//        }
//    }
//    int findex = 0;
//    private void shoot() {
//        findex++;
//        if(findex >= 10) {
//            Fire fire = new Fire(hero.x,hero.y);
//            fd.add(fire);
//            findex = 0;
//        }
//    }
//    protected void epMove() {
//        for(int i = 0; i < eps.size(); i++) {
//            Ep e = eps.get(i);
//            e.move();
//        }
//    }
//    int index = 0;
//    protected void epEnter() {
//        index++;
//        if(index >= 20) {
//            Ep e = new Ep();
//            eps.add(e);
//            index = 0;
//        }
//    }
//    public GamePanel(GameFrame frame) {
//        setBackground(Color.white);
//        bg = App.getImg("/image/logo.png");
//        MouseAdspter adater = new MouseAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e) {
//                int mx = e.getX();
//                int my = e.getY();
//                hero.moveToMouse(mx, my);
//                repaint();
//            }
//        };
//        addMouseListener(adapter);
//        addMouseMotionListener(adapter);
//        KeyAdapter kd = new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                int keyCode = e.getKeyCode();
//                if(keyCode== KeyEvent.VK_UP) {
//                    hero.moveUp();
//                }else if(keyCode==KeyEvent.VK_DOWN) {
//                    hero.moveDown();
//                }else if(keyCode==KeyEvent.VK_LEFT) {
//                    hero.moveLeft();
//                }else if(keyCode==KeyEvent.VK_RIGHT) {
//                    hero.moveRight();
//                }
//                repaint();
//            }
//        };
//        frame.addKeyListener(kd);
//    }
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.drawImage(hero.img,hero.x,hero.y,hero.w,hero.h,null);
//        for(int i = 0; i < eps.size(); i++) {
//            Ep ep = eps.get(i);
//            g.drawImage(ep.img,ep.x,ep.y,ep.w,ep.h,null);
//        }
//        for(int i = 0; i < fs.size(); i++) {
//            Fire fire = fs.get(i);
//            g.drawImage(fire img fire.x,fire.y,fire.w,fire.h,nll);
//        }
//    }
//}

package Case.PlaneBattle;

import java.util.Random;

/**
 * @author HuXianshen
 * @creat 2022-03-21:46
 */
public class Ep extends FlyObject{
    public Ep() {
    Random rd = new Random();
    int index = rd.nextInt(2) + 1;
    img = App.getImg("/image/p1.png");
    w = 42;
    h = 42;
    x = rd.nextInt(440 - w);
    y = 0;
    }
    public void move() {
        y += 4;
    }
    public boolean shootBy(Fire f) {
        boolean hit = x <= f.x+f.w&& x>f.x-w&& y<f.y+f.h&& y>f.y-h;
        return hit;
    }
}

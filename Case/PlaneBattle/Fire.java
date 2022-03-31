package Case.PlaneBattle;

/**
 * @author HuXianshen
 * @creat 2022-03-21:47
 */
public class Fire extends FlyObject{
    public Fire(int hx, int hy) {
        img = App.getImg("/image/p2.png");
        w = 5;
        h = 10;
        x = hx + 21;
        y = hy;
    }
    public void move() {
        y -= 10;
    }
}

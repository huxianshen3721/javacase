package Case.PlaneBattle;

/**
 * @author HuXianshen
 * @creat 2022-03-21:46
 */
public class Hero extends FlyObject{
    public Hero() {
        img = App.getImg("/image/love.png");
        x = 80;
        y = 420;
        w = 50;
        h = 50;
    }
    public void moveToMouse(int mx, int my) {
        x = mx - w / 2;
        y = my - w / 2;
    }
    public void moveUp() {
        y -= 10;
    }
    public void moveDown() {
        y += 10;
    }
    public void moveLeft() {
        x -= 10;
    }
    public void moveRight() {
        x +=10;
    }
}

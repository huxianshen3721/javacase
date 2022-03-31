package Case.SupperMarie;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HuXianshen
 * @creat 2022-03-13:20
 */
public class StaticValue {
    //background
    public static BufferedImage bg = null;
    public static BufferedImage bg2 = null;
    //jump left
    public static BufferedImage jump_L = null;
    //jump right
    public static BufferedImage jump_R = null;
    //stand left
    public static BufferedImage stand_L = null;
    //stand right
    public static BufferedImage stand_R = null;
    //castle
    public static BufferedImage tower = null;
    //flag
    public static BufferedImage gan = null;
    //obstacle
    public static List<BufferedImage> obstacle = new ArrayList<>();
    //run left
    public static List<BufferedImage> run_L = new ArrayList<>();
    //run right
    public static List<BufferedImage> run_R = new ArrayList<>();
    //mushroom enemy
    public static List<BufferedImage> mogu = new ArrayList<>();
    //chomper enemy
    public static List<BufferedImage> flower = new ArrayList<>();
    //prefix of path
    public static String path = System.getProperty("user.dir") + "/src/images/";
    //initialization method
    public static void init() throws IOException {
        try {
            //load background picture
            bg = ImageIO.read(new File(path + "bg.png"));
            bg2 = ImageIO.read(new File(path + "bg2.png"));
            stand_L = ImageIO.read(new File(path + "s_mario_stand_L.png"));
            stand_R = ImageIO.read(new File(path + "s_mario_stand_R.png"));
            tower = ImageIO.read(new File(path + "tower.png"));
            gan = ImageIO.read(new File(path + "gan.png"));
            jump_L = ImageIO.read(new File(path + "jump_L.png"));
            jump_R = ImageIO.read(new File(path + "jump_R.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 1; i <= 2; i++) {
            try {
                run_L.add(ImageIO.read(new File(path + "s_mario_run" + i + "_L.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for(int i = 1; i <= 2; i++) {
            try {
                run_R.add(ImageIO.read(new File(path + "s_mario_run" + i + "_R.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            obstacle.add(ImageIO.read(new File(path + "brick.png")));
            obstacle.add(ImageIO.read(new File(path + "soil_up.png")));
            obstacle.add(ImageIO.read(new File(path + "soil_bang.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 1; i <= 4; i++) {
            try {
                obstacle.add(ImageIO.read(new File(path + "pipe" + i + ".png")));
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        try {
            obstacle.add(ImageIO.read(new File(path + "brick2.png")));
            obstacle.add(ImageIO.read(new File(path + "flag.png")));
        } catch(IOException e) {
            e.printStackTrace();
        }
        for(int i = 1; i <= 3; i++) {
            try {
                mogu.add(ImageIO.read(new File(path + "funguns" + i + ".png")));
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        for(int i = 1; i <= 2; i++) {
            try {
                mogu.add(ImageIO.read(new File(path + "flower1.1" + i + ".png")));
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}

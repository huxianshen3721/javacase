package Case.NumberGuess;

/**
 * @author HuXianshen
 * @creat 2022-02-20:33
 */

public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("“I’m guessing “" + number);
    }
}

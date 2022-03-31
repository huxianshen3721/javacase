package Case.Calculate;

/**
 * @author HuXianshen
 * @creat 2022-03-11:16
 */
//两位数加法
//首数字为整数时只能两个整数相加


import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculate2 {
    public static void main(String[] args) {
        R r1 = new R();
        System.out.println("请输入");
        Scanner get = new Scanner(System.in);
        String a = get.nextLine();

        if(r1.isInteger(a)) {
            T t1 = new T();
            int[] arr = new int[2];
            Scanner input = new Scanner(System.in);
            for(int i = 0; i < 2; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println(t1.cal(arr[0],arr[1]));
        } else {
            T t1 = new T();
            double[] arr = new double[2];
            Scanner input = new Scanner(System.in);
            for(int i = 0; i < 2; i++) {
                arr[i] = input.nextDouble();
            }
            System.out.println(t1.cal(arr[0],arr[1]));

        }
    }
}

class T {
    public int cal(int a, int b) {
        return a + b;
    }
    public double cal(double a, double b) {
        return a + b;
    }
    public double cal(int a, double b) {
        return a + b;
    }
    public double cal(double a, int b) {
        return a + b;
    }
}
class R {
    public boolean  isInteger(String str) {
        Pattern xx = Pattern.compile("^[-\\+]?[\\d]*$");
        return xx.matcher(str).matches();
    }
}


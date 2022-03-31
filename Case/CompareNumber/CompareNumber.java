package Case.CompareNumber;

/**
 * @author HuXianshen
 * @creat 2022-03-10:42
 */

import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        System.out.println("请选择参与比较的数字个数");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int[] xx = new int[b];
        System.out.println("请输入需要比较的数");

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < xx.length; i++) {
            xx[i] = input.nextInt();
        }

        compare(xx);
    }

    public static void compare(int...number) {
        if(number.length > 0) {
            int max = number[0];
            for(int i = 1; i < number.length; i++) {
                if(number[i] > max) {
                    max = number[i];
                }
            }
            System.out.println("最大数是：" + max);

        }
        else {
            System.out.println("未检测到有效数字");
        }
    }
}

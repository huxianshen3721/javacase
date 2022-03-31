package Case.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author HuXianshen
 * @creat 2022-03-08:58
 */
public class SmallChange {
    public static void main(String[] args) {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "-----------------detail----------------";

        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note = "";
        do{
            System.out.println("\t============SmallChange========");
            System.out.println("\t\t\t1 detail");
            System.out.println("\t\t\t2 entry");
            System.out.println("\t\t\t3 consume");
            System.out.println("\t\t\t4 close");

            System.out.println("please choose");
            key = scanner.next();

            switch(key) {
                case "1" :
                    System.out.println(details);
                    break;

                case "2" :
                    System.out.println("2 entry");
                    System.out.println("income recorded amount");
                    money = scanner.nextDouble();
                    if(money <= 0) {
                        System.out.println("error");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\nincome entry\t+" + money + "\t"
                            + sdf.format(date) + "\t" + balance;
                    break;

                case "3" :
                    System.out.println("consumption amount:");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance) {
                        System.out.println("error");
                        break;
                    }
                    System.out.println("consumption explain:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t"
                            + sdf.format(date) + "\t" + balance;
                    break;

                case "4" :
                    String choice = "";
                    while(true) {
                        System.out.println("are you sure?(y/n)");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if("y".equals(choice)) {
                        loop = false;
                    }
                    break;

                default:
                    System.out.println("error");
            }
        }while(loop);
        System.out.println("successful exit");
    }
}

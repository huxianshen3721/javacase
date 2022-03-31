package Case.SmallChange.SmallChange2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author HuXianshen
 * @creat 2022-03-15:00
 * function
 * OOP
 * Convert functions into methods
 */

public class SmallChange2 {
    //attribute

    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "-----------------detail----------------";

    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String note = "";


    public void mainMenu() {
        do{
            System.out.println("\t============SmallChange(OOP)========");
            System.out.println("\t\t\t1 detail");
            System.out.println("\t\t\t2 entry");
            System.out.println("\t\t\t3 consume");
            System.out.println("\t\t\t4 close");

            System.out.println("please choose");
            key = scanner.next();

            switch(key) {
                case "1" :
                    this.detail();
                    break;

                case "2" :
                    this.income();
                    break;

                case "3" :
                    this.pay();
                    break;

                case "4" :
                    this.exit();
                    break;
                default:
                    System.out.println("error");
            }
        }while(loop);
    }
    public void detail() {
        System.out.println(details);
    }
    public void income() {
        System.out.println("income recorded amount:");
        money = scanner.nextDouble();
        if(money <= 0) {
            System.out.println("error");
            return;//Equivalent to exit method
        }
        balance += money;
        date = new Date();
        details += "\nincome entry\t+" + money + "\t"
                + sdf.format(date) + "\t" + balance;
    }
    public void pay() {
        System.out.println("consumption amount:");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("error");
            return;
        }
        System.out.println("consumption explain:");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t"
                + sdf.format(date) + "\t" + balance;
    }
    public void exit() {
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
    }
}

/**
 * 谷粒记账系统
 * @author MaxSun
 * @version 1.0
 */

import java.util.Scanner;
public class Grain {
    public static void menu() {
        System.out.println("----------谷粒记账软件----------");
        System.out.println("           1 收支明细");
        System.out.println("           2 登记收入");
        System.out.println("           3 登记支出");
        System.out.println("           4 退  出");
        System.out.println();
        System.out.print("请选择(1-4):");
    }
    public static void main(String[] args) {
        int familyBalance = 10000;
        String details = "收支\t账户金额\t收支金额\t说 明\n";
        do {
            menu();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("----------当前收支明细记录----------");
                    System.out.println(details);
                    System.out.println("---------------------------------");
                break;
                case 2:
                    System.out.print("收入金额：");
                    int balance = sc.nextInt();
                    System.out.print("收入说明：");
                    String explanation = sc.next();
                    familyBalance += balance;
                    details += "收入\t";
                    details += familyBalance;
                    details += "\t\t";
                    details += balance;
                    details += "\t\t";
                    details += explanation;
                    details += '\n';
                break;
                case 3:
                    System.out.print("支出金额：");
                    balance = sc.nextInt();
                    System.out.print("支出说明：");
                    explanation = sc.next();
                    familyBalance -= balance;
                    details += "支出\t";
                    details += familyBalance;
                    details += "\t\t";
                    details += balance;
                    details += "\t\t";
                    details += explanation;
                    details += '\n';
                break;
                case 4:
                    System.out.print("确认是否退出(Y/N):");
                    String str = sc.next();
                    if(str.equals("Y"))
                        return;
                break;
                default:
                    System.out.println("选项有误");
                break;
            }
        }while(true);
    }
}
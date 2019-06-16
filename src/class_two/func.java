package class_two;

import java.sql.SQLOutput;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        while (true) {
            getMenu();
            System.out.println("请输入数字 退出输入exit");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int num = input.nextInt();
                //        System.out.println(isRunYear(num));
                System.out.println(getMenu(num));
            }
            if (input.hasNext()) {
                String instruction = input.next();
                if (instruction == "exit") {
                    break;
                }
            }
        }
    }

    // public 访问权限修饰符
    // static 静态修饰符，描述的方法可以直接调用
    // void 返回值(无返回值)
    public static void getMenu() {
        System.out.println("--菜单--");
        System.out.println("1,宫保鸡丁");
        System.out.println("2,韭菜鸡蛋");
        System.out.println("3,番茄炒蛋");
        System.out.println("4,扬州炒饭");
    }

    public static String getMenu(int index) {
        switch (index) {
            case 1:
                return "宫保鸡丁";
            case 2:
                return "韭菜鸡蛋";
            case 3:
                return "番茄炒蛋";
            case 4:
                return "扬州炒饭";
            default:
                return "没有这道菜";
        }
    }


}

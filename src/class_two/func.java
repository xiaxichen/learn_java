package class_two;

import java.sql.SQLOutput;
import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        getMenu();
        System.out.println("请输入数字");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        prtintStar(num);
        System.out.println(isRunYear(num));

    }
   // public 访问权限修饰符
   // static 静态修饰符，描述的方法可以直接调用
   // void 返回值(无返回值)
   public static void getMenu(){
       System.out.println("--菜单--");
       System.out.println("1,宫保鸡丁");
       System.out.println("2,韭菜鸡蛋");
       System.out.println("3,番茄炒蛋");
       System.out.println("4,扬州炒饭");
    }
    public static void prtintStar(int num){
        for (int i = 0; i <num; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("✨");
            }
            System.out.println();
        }

    }
    public static String isRunYear(int year){
        if((year%4==0 && year%100!=0) || year%400==0){
            return "是闰年";
        }else{
            return "是平年";
        }
    }

}

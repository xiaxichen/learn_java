package class_one;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字母");
        char c = input.next().charAt(0);
        if(c>=65&&c<=90){
            System.out.println("大写字母");
        }else{
            System.out.println("小写字母");
        }
        //判断是否是闰年
        System.out.println("请输入年份");
        int year = input.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("是闰年");
        }else{
            System.out.println("是平年");
        }
    }
}

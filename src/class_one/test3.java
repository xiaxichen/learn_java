package class_one;
/*
 * 根据天数计算周数和剩余天数
 * */

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入剩余天数:");
        int days = input.nextInt();
        System.out.println("周数是"+(days/7)+"剩余天数为"+(days%7));
    }
}

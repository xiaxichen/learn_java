package class_one;

import java.util.Scanner;

/**
 * 从键盘输入一个声明初始化一个圆柱体的高和底面积半径，pai值是3.14,求圆柱体的面积， 并显示输出圆柱体的体积； n(r^2)h。
 */

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱体高:");
        int h = input.nextInt();
        System.out.println("请输入圆柱体的底面半径:：");
        float r = input.nextFloat();
        double result = 3.14 * r * r * h;
        System.out.println("圆柱体的体积是" + result);
    }
}

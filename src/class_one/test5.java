package class_one;

import java.util.Scanner;

/*
 * 面试题：以最快的速度计算8*4的结果
 * */
public class test5 {
    public static void main(String[] args) {
        // 0000 1000 8
        // 0010 0000 32
        // 左移算法位移数作为2的次幂与操作数相乘
        System.out.println(8 << 2);//计算速度最快的
        System.out.println(8 << 3);
        // 右移算法位移作为2的次幂与操作数相除
        System.out.println(32 >> 2);
        System.out.println(64 >> 3);
        // 通过键盘输入，初始化两个数值，输出显示交换后的数据
        Scanner input = new Scanner(System.in);
        System.out.println("请输入以第一个数");
        int a = input.nextInt();
        System.out.println("请输入第二个数");
        int b = input.nextInt();
        //通过第三个变量作为交换
        int c = a;
        a = b;
        b = c;
        System.out.println("a=" + a + "\r\n" + "b=" + b);
        // 不通过第三个变量如何交换两个数值
        a = a+b-(b=a);//先做运算后做赋值
        System.out.println("a=" + a + "\r\n" + "b=" + b);
        //最快的方式 a!=b
        /*
        A = 1010
        B = 1100

        A = 0110 结果给A
        B = 1100

        B = 1010 结果给B
        A = 0110

        A = 1100 结果给A
        B = 1010
        * */
        a = a^b;
        System.out.println(a+""+b);
        b = a^b;
        System.out.println(a+""+b);
        a = a^b;
        System.out.println("a=" + a + "\r\n" + "b=" + b);
    }
}

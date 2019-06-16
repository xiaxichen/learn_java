package class_one;

import java.util.Scanner;

/*
* 定义一个五位数，求各个位上的和
* */
public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入多个数字：");
        String str = input.next();
        String[] str_list = str.split("");
        int result = 0;
        for (int i = 0; i < str_list.length; i++) {
            result += Integer.parseInt(str_list[i]);
        }
        System.out.println(result);
    }
}

package class_two;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("打印要输出的星星✨行数");
        if (input.hasNext()) {
            int line = input.nextInt();
            printStart(line);
        }

    }
    public static void printStart(int line) {
        //外循环控制行数
        for (int i = 1; i <= line; i++) {
            //内循环控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("✨");
            }
            System.out.println();
        }
    }
}

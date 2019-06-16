package class_one;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入1-7");
        int day = input.nextInt();
        if (0 < day && day < 8) {
            switch (day) {
                case 1:
                    System.out.println("今天星期一");
                    break;
                case 2:
                    System.out.println("今天星期二");
                    break;
                case 3:
                    System.out.println("今天星期三");
                    break;
                case 4:
                    System.out.println("今天星期四");
                    break;
                case 5:
                    System.out.println("今天星期五");
                    break;
                case 6:
                    System.out.println("今天星期六");
                    break;
                case 7:
                    System.out.println("今天星期天");
                    break;
                default:
                    System.out.println("？？？？");
            }
        }else{
            System.out.println("输入错误");
        }

    }
}

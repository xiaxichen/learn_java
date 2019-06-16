package class_one;

import java.util.Scanner;

//三目运算符
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = input.nextInt();
        boolean bool = score>60?true:false;
        if (bool){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}

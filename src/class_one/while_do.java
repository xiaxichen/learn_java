package class_one;

public class while_do {
    public static void main(String[] args) {
        int num = 0;
        short i = 0;
        while (i <= 100) {
            num += i;
            i++;
        }
        System.out.println(num);
        i = 1;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println("偶数" + i);
            } else {
                System.out.println("奇数" + i);
            }
            if (i % 3 == 0) {
                System.out.println("三的倍数" + i);
            }
            i++;
        }
        i = 0;//至少执行一次
        do {
            System.out.println(i);//循环体
            i--;
        }while (i>=0);//循环条件
    }
}

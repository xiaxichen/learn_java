package class_three;

//重载 overloading
public class test1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int num = add(a, b);
        System.out.println(num);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

}


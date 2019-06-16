package class_one;

/**
 * 基本数据类型转换
 */

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;

        //char -> int 自动转换
        char sex = '男';
        int sex2 = sex;
        System.out.println(sex2);


        float f = 20f;
        double d = f;
        System.out.println(d);

        // float 和 double 是属于近似值
        // byte char short int long 属于精确值
        // 精确值 转近似值时可能丢失精度


        int num = 2141592600;
        float num2 = num;
        System.out.println(num2);

        //面试题
        //byte short int 在计算时会强制转换为int类型
        /*强制转换类型*/
        short s1 = 10;
//        s1 = s1+1 失败
//        s1 +=1;
        s1 = (short)(s1+1);
        System.out.println(s1);

        //把打的容量类型转换为小的容量类型，需要添加强制类型转换
        int x = (int)lon;
        System.out.println(x);
    }
}
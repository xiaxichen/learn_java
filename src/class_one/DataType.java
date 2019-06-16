package class_one;

public class DataType {
    public static void main(String[] args){
        int num = 10;//局部变量

        //八种数据类型
        //数值类型
        byte b = 10; //占用一个字节, 取值范围-128~127 默认值0
        System.out.println(b);
        short s = 10; //占用二个字节，取值范围-32768~32767，在实际开发中使用较少 默认值0
        int i = 10; //占用四个字节，取值范围-2147483648~2147483647 默认值0
        long lon = 100L; //占用八个字节，取值范围 默认值0
        float f = 10.98F; //占用四个字节, 默认值 0.0F
        double d = 10.12346D;  //占用八个字节，默认值 0.0D

        //字符类型
        char c = 'A'; //每个英文字符占用2个字节 范围 0~65535 默认值 \u0000
        //bool类型
        boolean bool = true; //占用字节不确定，默认值false


        //定义变量的格式：
        //类型 变量名； //声明一个变量

        b = 20; //赋值
        System.out.println(b);
        char c2 = 97; //ascii码表 a
        System.out.println(c2);
    }
}
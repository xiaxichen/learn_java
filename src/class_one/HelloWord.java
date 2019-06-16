package class_one;

/**
 public 共有
 class 关键字
 HelloWord 自定义类名
 {作用域}
*/

public class HelloWord {
    /*
    多行注释
    static 关键字 表示静态的
    void 关键字 返回值类型（空，没有返回值）
    main 表示主函数名称
    mian()表示函数参数列表
    String[] 表示字符串数组
    args 表示字符串数组名称
    */
    int a = 20;//成员变量
    public static void main(String[] args) {
        int num = 10;//局部变量
        //向控制台输出
        System.out.println("Hellow World");
        System.out.println(num);
    }
}
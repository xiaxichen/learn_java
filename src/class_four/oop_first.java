package class_four;

public class oop_first {
    public static void main(String[] args) {
        Horse h = null;//声明一个类的变量(除了八种数据类型以外，都是数据引用类型包括数组！)
        h = new Horse();
        h.name = "black";
        h.age = 13;
        h.Run();
        System.out.println(h.GetAge());
    }
}

class Horse {
    String name;
    int age;

    public void Run() {
        System.out.println("run!");
    }

    public int GetAge() {
        return this.age;
    }
}
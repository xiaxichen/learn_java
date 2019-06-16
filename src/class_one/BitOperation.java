package class_one;

public class BitOperation {
    public static void main(String[] args) {

        // 按位取反
        // 0000 1010
        // 取反 1111 0101
        System.out.println(~10);
        // 按位与运算
        // 0000 1010
        // 0000 0001
        // 0000 0000
        System.out.println(1 & 10);
        // 按位或运算
        // 0000 1011
        // 0000 1111
        // 0000 1111
        System.out.println(11 | 15);
        // 按位异或运算
        // 0000 1011
        // 0000 1111
        // 0000 0100
        System.out.println(11 ^ 15);
        // 左移
        // 0000 1010
        // 0010 1000
        System.out.println(10<<2);
        // 带符号右移
        // 0000 1010
        // 0000 0010
        System.out.println(10>>2);
        // 无符号右移
        // 0110 0100
        // 0000 0011
        System.out.println(100>>>3);
        System.out.println(-100>>3);
    }
}

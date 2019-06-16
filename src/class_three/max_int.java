package class_three;

public class max_int {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int max = Max(num);
        System.out.println(max);
        int min = Min(num);
        System.out.println(min);
    }

    // 求数列中的最大值
    public static int Max(int[] num) {
        int max = num[0];
        int maxLength = num.length;
        for (int i = 1; i < maxLength; i++) {
            if (num[i] > max) {
                num[i] = num[i] + max;
                max = num[i] - max;
                num[i] = num[i] - max;
            }
        }
        return max;
    }

    // 求数列中的最小值
    public static int Min(int[] num) {
        int min = num[0];
        int maxLength = num.length;
        for (int i = 1; i < maxLength; i++) {
            if (num[i] > min) {
                num[i] = num[i] + min;
                min = num[i] - min;
                num[i] = num[i] - min;
            }
        }
        return min;
    }
}
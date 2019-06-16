package class_two;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] nums = random();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(caishuzi(num, nums));
    }

    public static int[] random() {
        Random r = new Random();
        int[] nums = new int[5];
        int nums_length = nums.length;
        for (int i = 0; i < nums_length; i++) {
            nums[i] = r.nextInt(50);
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static String caishuzi(int num, int... nums) {
        for (int x : nums
        ) {
            if (x == num) {
                return "ok";
            }
        }
        return "no";
    }
}

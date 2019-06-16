package class_three;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {24, 34, 5, 4, 17, 90};
        System.out.println(Arrays.toString(bubbleSort(nums)));
        System.out.println("-------------");
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {
        int nums_length = nums.length;
        //外部控制轮数
        for (int l = 0; l < nums_length - 1; l++) { //比较轮数等于数列长度-1
            for (int i = 0; i < nums_length - 1 - l; i++) {
                if (nums[i] > nums[i + 1]) {
                    nums[i] = nums[i] + nums[i + 1];
                    nums[i + 1] = nums[i] - nums[i + 1];
                    nums[i] = nums[i] - nums[i + 1];
                }
            }
        }
        return nums;
    }

    public static int[] selectionSort(int[] nums) {
        int minIndex;
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                nums[minIndex] = nums[minIndex] + nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = nums[minIndex] - nums[i];
            }
        }
        return nums;
    }
}

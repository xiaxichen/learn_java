package class_two;


import java.util.Arrays;

public class java_array {
    public static void main(String[] args) {
        //第一种
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));
        //第二种
        int[] nums2;
        nums2 = new int[5];
        //第三种
        int[] num3 = new int[]{
                1, 2, 3, 4, 5,
        };
        //第四种
        int[] num4 = {1, 2, 4, 5, 6};
        for_array(num4);
        print(1,2,3,4,5,6);
    }

    public static void for_array(int[] num_list) {
//        int len = num_list.length;
//        for (int i = 0; i < len; i++) {
//            System.out.println(num_list[i]);
//        }
        for (int x : num_list
        ) {
            System.out.println(x);
            System.out.println("-----------------");
        }
    }
    public static void print(int i,int...num_list){
        for (int x : num_list
        ) {
            System.out.println(x);
            System.out.println("-----------------");
        }
        System.out.println(num_list.length);
        System.out.println(i);
    }

}

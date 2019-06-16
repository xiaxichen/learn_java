package class_two;

public class test1 {
    public static void main(String[] args) {
        long startTime=System.nanoTime();
        int[] a = {10,50,4,60,1};
        System.out.println(max(a));
        long endTime=System.nanoTime();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }

    public static int max(int... nums) {
        int max = nums[0];
        int len = nums.length;
        for (int i = 0; i <len ; i++) {
            if(nums[i]>max){
                nums[i] = nums[i]^max;
                max = nums[i]^max;
                nums[i] = nums[i]^max;
//                int a = nums[i];
//                nums[i] = max;
//                max = a;
            }
        }
        return max;
    }
}

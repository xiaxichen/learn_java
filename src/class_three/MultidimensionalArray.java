package class_three;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int nums_list[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};
        int classlen = nums_list.length;
        for (int i = 0; i < classlen; i++) {
            int sum = 0;
            int count = nums_list[i].length;
            for (int j = 0; j < count; j++) {
                sum += nums_list[i][j];
            }
            int avg = sum/count;
            System.out.println("第"+(i+1)+"班的成绩是:"+avg);
        }
    }
}

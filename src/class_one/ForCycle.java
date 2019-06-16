package class_one;

public class ForCycle {
    public static void main(String[] args) {
        //1
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        //2
        int j =0;
        for(;j<10;j++){
            System.out.println(j);
        }
        //3
        for(int i=0;i<10;){
            System.out.println(i);
            i++;
        }
        //4
        int x=0;
        for(;x<10;){
            System.out.println(x);
            x++;
        }

        //斐波那切数列
        int n1 = 1;
        int n2 = 1;
        int next = 0;
        System.out.print(n1+" "+n2+" ");
        for(int i=0;i<8;i++){
            next = n1+n2;
            System.out.print(next+" ");
            n1 = n2;
            n2 = next;
        }
    }
}

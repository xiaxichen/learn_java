package class_three;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class double_chromosphere {
    public static void main(String[] args) {
        int[] userRedBall = new int[6]; //用户选择的红球号码
        int[] sysRedBall = new int[6]; //系统生成的红球号码
        int userBlueBall = 0; //用户选择的蓝球
        int sysBuleBall; //系统生成的蓝球
        int redCount = 0;//记录用户选择正确的红球数
        int blueCount = 0;//记录用户选择正确的蓝球数
        int[] redBall = new int[33];
        Random r = new Random();
        //需要随机生成6个1~33之间不重复的数（算法）
        for (int i = 0; i < redBall.length; i++) {
            redBall[i] = i + 1;
        }

        //游戏开始 系统提示
        System.out.println("双色球游戏开始！good luck！");
        System.out.println("请问您是要计算还是手选（机选：1，手选：2）");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int isAuto = input.nextInt();
            switch (isAuto) {
                case 1:
                    //机选
                    computerSelection(redBall, userRedBall);//机选红球
                    userBlueBall = r.nextInt(16) + 1;//机选蓝球
                    flag = false;
                    break;
                case 2:
                    //手选
                    System.out.println("请输入6个红球号码！(1-33):");
                    for (int i = 0; i < userRedBall.length; i++) {
                        userRedBall[i] = input.nextInt();
                    }
                    System.out.println("请选择一个蓝球!(1-16):");
                    userBlueBall = input.nextInt();
                    flag = false;
                    break;
                default:
                    System.out.println("请问您是要计算还是手选（机选：1，手选：2）");

            }
        }
        
        //系统随机生成号码
        //红球
        computerSelection(redBall, sysRedBall);
        //蓝球
        sysBuleBall = r.nextInt(16) + 1;
        //统计结果
        for (int ball:userRedBall
             ) {
            for (int j = 0; j < sysRedBall.length - redCount; j++) {
                if (ball == sysRedBall[j]) {
                    int temp = sysRedBall[j];
                    sysRedBall[j] = sysRedBall[sysRedBall.length - 1 - redCount];
                    sysRedBall[sysRedBall.length - 1 - redCount] = temp;
                    redCount++;
                    break;
                }
            }
        }
        //统计蓝球
        if (userBlueBall == sysBuleBall) {
            blueCount = 1;
        }
        //验证是否中奖
        if (blueCount == 0 && redCount <= 3) {
            System.out.println("未中奖");
        } else if (blueCount == 1 && redCount < 3) {
            System.out.println("六等奖");
        } else if (blueCount == 1 && redCount == 3 || (blueCount == 0 && redCount == 4)) {
            System.out.println("五等奖");
        } else if (blueCount == 1 && redCount == 4 || (blueCount == 0 && redCount == 5)) {
            System.out.println("四等奖");
        } else if (blueCount == 1 && redCount == 5) {
            System.out.println("三等奖");
        } else if (blueCount == 0 && redCount == 6) {
            System.out.println("二等奖");
        } else if (blueCount == 1 && redCount == 6) {
            System.out.println("一等奖");
        }
        //公布系统号码
        System.out.println("本期红球号码为！");
        sort(sysRedBall);
        System.out.println(Arrays.toString(sysRedBall) );
        System.out.println("本期蓝球号码为！");
        System.out.println(sysBuleBall);
        //公布用户号码
        System.out.println("您选择的红球号码为");
        sort(sysRedBall);
        System.out.println(Arrays.toString(userRedBall));
        System.out.println("您选择的蓝球号码为");
        System.out.println(userBlueBall);
    }

    // 用于指定数列中，随机生成多个不重复的数
    private static void computerSelection(int[] redBall, int[] userBall) {
        Random r = new Random();
        for (int i = 0; i < userBall.length; i++) {
            int index = r.nextInt(redBall.length - i);
            userBall[i] = redBall[index];
            int temp = redBall[index];
            redBall[index] = redBall[redBall.length - 1 - i];
            redBall[redBall.length - 1 - i] = temp;
        }
    }
}

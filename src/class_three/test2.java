package class_three;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static class_three.Sorting.bubbleSort;

/**
 * 模拟双色球综合案例
 * 接收用户选号（6红，1蓝）
 * 生成系统号码（6红，1蓝）
 * 比较系统号码和用户号码，记录个数
 * 验证是否中奖
 * 系统号码排序
 * 公布结果
 **/
public class test2 {
    public static void main(String[] args) {
        //定义相关变量
        int[] userRedBall = new int[6];//用户选择的红球号码
        int[] sysRedBall = new int[6];//系统生成的红球号码
        int userBlueBall = 0;//用户选择的蓝球
        int sysBlueBall = 0;//系统生成的蓝球
        int redCount = 0;//用户猜对的红球数
        int blueCount = 0;//用户猜对的蓝球数
        int[] redBall = new int[33];//用于存储1-33的红球号码
        //随机生成6个1-33之间不重复的数（算法）
        for (int i = 1; i < redBall.length; i++) {
            redBall[i] = i;
        }
        //游戏开始 系统提示
        System.out.println("双色球GameStart!");
        System.out.println("选择1：机选\n2：手选");

        Scanner input = new Scanner(System.in);
        Random r = new Random();
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
                    System.out.println("请选择6个红球号码（1-33）:");
                    for (int i = 0; i < userRedBall.length; i++) {
                        userRedBall[i] = input.nextInt();
                        flag = false;
                    }
                    System.out.println("请选择一个蓝球号码（1-16）");
                    userBlueBall = input.nextInt();
                    flag = false;
                    break;
                default:
                    System.out.println("选择1：机选\n2：手选");
            }
        }
        //系统随机生成号码
        //红球
        computerSelection(redBall, sysRedBall);
        //篮球
        sysBlueBall = r.nextInt(16) + 1;
        //统计结果
        //统计红球
        for (int i = 0; i < userRedBall.length-redCount; i++) {
            for (int j = 0; j < sysRedBall.length; j++) {
                if (userRedBall[i] == sysRedBall[i]) {
                    int temp = sysRedBall[i];
                    sysRedBall[j] = sysRedBall[sysRedBall.length - 1 - redCount];
                    sysRedBall[sysRedBall.length - 1 - redCount] = temp;
                    redCount++;
                }
            }
        }
        //统计篮球
        if (userBlueBall == sysBlueBall) {
            blueCount = 1;
        }
        if (blueCount == 0 && redCount <= 3) {
            System.out.println("末中奖");
        } else if (blueCount == 1 && redCount < 3) {
            System.out.println("六等奖");
        } else if ((blueCount == 1 && redCount == 3) || (blueCount == 0 && redCount == 4)) {
            System.out.println("五等奖");
        } else if ((blueCount == 1 && redCount == 4) || (blueCount == 0 && redCount == 5)) {
            System.out.println("四等奖");
        } else if (blueCount == 1 && redCount == 5) {
            System.out.println("三等奖");
        } else if (blueCount == 0 && redCount == 6) {
            System.out.println("二等奖");
        } else if (blueCount == 1 && redCount == 6) {
            System.out.println("一等奖");
        } else {
            System.out.println("系统有误，中奖无效");
        }
        //系统号码
        System.out.println("本期红球号码为"+Arrays.toString(bubbleSort(sysRedBall)));
        System.out.println("本期蓝球号码为"+sysBlueBall);
        //用户号码
        System.out.println("用户红球号码为"+Arrays.toString(bubbleSort(userRedBall)));
        System.out.println("用户蓝球号码为"+userBlueBall);
    }

    //用于在指定队列中，随机生成多个不重复的数算法
    public static void computerSelection(int[] redBall, int[] userRedBall) {

        Random r = new Random();
        int index = -1;
        for (int i = 0; i < userRedBall.length; i++) {
            index = r.nextInt(redBall.length - i);
            userRedBall[i] = redBall[index];
            int temp = redBall[index];
            redBall[index] = redBall[redBall.length - 1 - i];
            redBall[redBall.length - 1 - i] = temp;

        }

    }
}

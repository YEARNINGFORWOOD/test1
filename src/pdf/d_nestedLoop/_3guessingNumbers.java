package pdf.d_nestedLoop;

import java.util.Scanner;

//3. 小游戏: 猜数字
//        输入整数n(0<n<100), 想让程序猜到的值
//        如果程序没有猜中, 则提示太大/太小 并让程序接着猜测
//        程序通过二分法不断缩小猜测范围, 直到猜中n
//        例如n = 39
//        程序第一次猜测50, 判断数值太大
//        第二次猜测25, 判断数值太小
//        第三次猜测37 判断数值太小
//        43 大
//        40 大
//        38 小
//        39 正确
//        输入: n 表示被猜测值
//        输出: 每行输出一个整数, 表示程序当前猜测的数字
//        最终行输出猜测的次数
//        样例输入:
//        39
//        样例输出:
//        50
//        25
//        37
//        43
//        40
//        38
//        39
//        最终猜测了7次
public class _3guessingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想让我猜的数字：");
        int result = sc.nextInt();
        int max = 100;
        int min = 0;
        int count = 0;
        while (true) {
            int guess = (max+min)/2;
            System.out.println("你的数字是不是" + guess + "呀");
            if(guess < result){
                System.out.println("嗯？有点小了？╮(๑•́ ₃•̀๑)╭");
                min = guess;
                count++;
            }
            else if(guess > result){
                System.out.println("嗯？有点大了？（⊙.⊙）");
                max = guess;
                count++;
            }
            else {
                System.out.println("嘿嘿，我就猜了" + count +"次，我厉害吧♪（＾∀＾●）ﾉｼ");
                break;
            }

            }

        }

    }


package pdf.b_judge;

import java.util.Scanner;

public class _2pointTest {
    //    2. 打分系统
//            在某次考试时, 学生的提交成绩惨不忍睹
//    云海学长为了让大家及格可谓煞费苦心, 他苦思三天三夜, 终于想出了一套打分方案:
//    正确数量在0~10时, 每题6分
//    正确数量在11~20时, 第11~20题, 每题2分
//    正确数量在21~40时, 第21~40题, 每题1分
//    但因为需要计分的作业太多了, 希望你能帮帮云海学长, 实现该计分程序.
//            输入做对的题目数量n, 输出得分.
//            (0<=n<=40)
//    样例输入:
//            23
//    样例输出:
//            83
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入做对的题目数：");
        int n = scanner.nextInt();
        int result = 0;
        if (0<n&&n<10){
             result = n * 6;
        }
        else if (11<n&&n<20){
             result = (n-10) * 2 + (10 * 6);
        }
        else if (21<n&&n<40){
             result = (n-20) * 1 + (10 * 6) + (10 * 2);
        }
        System.out.println("得分为:" + result);
    }
}

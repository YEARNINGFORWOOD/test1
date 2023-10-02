package pdf.c_simpleLoop;

import java.util.Scanner;

public class _1AverageAge {
    //    1. 求平均年龄
//01星球有学长若干名, 给出每个学长的年龄, 求01星球学长的平均年龄, 保留小数点后两位
//    输入:
//    第一行: 整数n(1<n<100), 表示人数
//    之后n行: 每行一个整数a(15<a<55), 表示第n个学长的年龄
//    输出:
//    一个浮点数, 保留两位小数. 表示01星球学长平均年龄
//    样例输入:
//            3
//            18
//            18
//            17
//    样例输出:
//            17.67
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++){
            int age = sc.nextInt();
            sum+=age;
        }
        double avg = sum/n;
        System.out.printf("%.2f",avg);
    }
}

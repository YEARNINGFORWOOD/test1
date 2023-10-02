package pdf.c_simpleLoop;

import java.util.Scanner;

public class _2sumOf2 {
    //    2. 张三上课时走神, 在作业上写了很多222222222222222 结果被老师发现了
//    张三连忙掩饰说自己在算2+22+222+2222+22222的和,
//    老师很欣慰, 问他算出来没有
//    张三很困扰, 因为草稿纸写满了2 已经不够用了
//    大家快帮帮张三吧
//    设计一个程序, 输入n和a 求Sn
//    Sn = a + aa + aaa + … + aaaaa(n个a)
//    输入: 两个整数n, a
//            (1<n<9), (1<=a<=9)
//    输出:
//    Sn的值
//    样例输入:
//            5 2
//    样例输出:
//            24690
//    样例解析: Sn = 2 + 22 + 222 + 2222 + 22222 = 24690
//            4. 嵌套循环
//    样例输入:
//            4 5
//    样例输出:
//            6170
//    样例解析: Sn = 5 + 55 + 555 + 5555
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int sum = 0;

        //表达有几个数，i是几就是第几个数
        for (int i = 1; i <= n; i++) {
            int curr = a;

            //第几次就有几位
            for(int j =1; j < i; j++){
                curr = curr * 10 +a;
            }
            sum += curr;
        }
        System.out.println("sum = " + sum);
    }

}

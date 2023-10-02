package pdf.b_judge;

import java.util.Scanner;

public class _1judge {
//    1. 设计一个程序, 输入a,b,c三个整数, 输出最大的数.
//            (MIN_INT < a,b,c < MAX_INT)
//    样例输入:
//            1 3 2
//    样例输出:
//            3

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int maxInt = a[0];
        if (a[0]<a[1]){
            maxInt = a[1];
        }
        if (maxInt<a[2]){
            maxInt = a[2];
        }
        System.out.println("max=" + maxInt);
    }

}

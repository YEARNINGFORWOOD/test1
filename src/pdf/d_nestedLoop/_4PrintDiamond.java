package pdf.d_nestedLoop;

import java.util.Scanner;
//4. 打印菱形
//        输入菱形的边长n, 打印一个对应大小的菱形
//        (1<n<100)
//        样例输入: 5
//        样例输出:
//        *
//        ***
//        *****
//        *******
//        *********
//        *******
//        *****
//        ***
//        *

public class _4PrintDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个菱形的边长呗");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i ;j++){
                System.out.print(" ");
            }
            for (int j= 0 ; j < i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n+1; i++) {
            for (int j= 0 ; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (n - i)*2-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

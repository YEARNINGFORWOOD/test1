package pdf.d_nestedLoop;

import java.util.Scanner;

public class _1MultiplicationTable {
    //    1. 使用程序打印九九乘法表
//    样例输出:
//            1 * 1 = 1
//            1 * 2 = 2 2 * 2 = 4
//            1 * 3 = 3 2 * 3 = 6 3 * 3 = 9
//            ….
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("想来多少遍？");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
                //System.out.println自带回车
            }
            //System.out.print("\n");
            System.out.println();
        }
    }

}

package pdf.f_MultidimensionalArray;

/*
3. 杨辉三角
        输入n(1<n<10), 打印高度为n的杨辉三角
        样例输入: 5
        样例输出:
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
*/


import java.util.Scanner;

public class _3YangHuiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数，我需要知道杨辉三角的高度( •̀ ω •́ )✧");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        a[0][0] = 1;
        System.out.println("杨辉三角如下"  );
        for (int i = 0; i < n; i++){
            a[i][0] = 1;
            a[i][i] = 1;
        }
        for (int i = 2; i < n; i++){
            for (int j = 1; j < i; j++){
                //b[i][j] = a[j][i];
                a[i][j]  = a[i-1][j-1]+a[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0){
                    break;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}

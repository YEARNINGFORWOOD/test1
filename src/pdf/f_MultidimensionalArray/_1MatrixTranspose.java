package pdf.f_MultidimensionalArray;
//1. 矩阵转置
//        输入一个数字构成的矩形, 将矩形的值进行转置后打印
//        输入:
//        第一行 正整数n(1<n<10), 表示矩阵的边长
//        随后输入一个矩阵
//        输出:
//        转置后的矩阵
//        样例输入:
//        3
//        1 2 3
//        4 5 6
//        7 8 9
//        样例输出:
//        1 4 7
//        2 5 8
//        3 6 9


import java.util.Scanner;

public class _1MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数，我需要知道矩阵的边长( •̀ ω •́ )✧");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        System.out.println("请输入矩阵"  );
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                //System.out.print("给第"+(i+1)+"行"+"第"+(j+1)+"列赋值：");
                a[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                b[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();

        }
    }
}

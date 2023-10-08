package pdf.f_MultidimensionalArray;

//2. 颈椎病治疗
//        最近云海学长一直对着电脑改bug, 颈椎不舒服, 希望各位小伙伴帮云海学长治治
//        提供一张图片, 将图片旋转后再发给云海学长, 这样学长看图的时候就需要歪着脖子, 时间久了, 颈椎病就
//        治好了
//        输入一个数字构成的矩形, 将矩形的值进行90度旋转后打印
//        7. 字符/字符串
//        输入:
//        第一行 正整数n(1<n<10), 表示矩阵的边长
//        随后输入一个矩阵
//        输出:
//        90度旋转后的矩阵
//        样例输入:
//        3
//        1 2 3
//        4 5 6
//        7 8 9
//        样例输出:
//        7 4 1
//        8 5 2
//        9 6 3

import java.util.Scanner;

public class _2TreatmentOfCervicalSpondylosis {
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
                //b[i][j] = a[j][i];
                b[j][a[i].length-i-1]  = a[i][j];
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

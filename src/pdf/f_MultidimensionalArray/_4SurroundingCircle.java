package pdf.f_MultidimensionalArray;

/*
*4. 包围圈
        东东哥在一场军事演练中, 需要对一片正方形森林进行排查,
        为了防止被包围, 东东哥需要先排查外围才能进一步深入
        输入: 正整数n(1<n<10), 表示森林的边长
        输出: 东东哥排查森林的顺序
        样例输入:
        4
        样例输出:
        1 2 3 4
        12 13 14 5
        11 16 15 6
        10 9 8 7
*/

import java.util.Scanner;

public class _4SurroundingCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数，表示森林的边长( •̀ ω •́ )✧");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int count = 1;

        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;

        while (true) {
            for (int i = left; i < right + 1; i++) {
                a[up][i] = count++;
            }
            if (++ up == down+1 && left == right+1) break;

            for (int i = up; i < down + 1; i++) {
                a[i][right] = count++;
            }
            if (--right == left-1 && up == down+1) break;

            for (int i = right; i > left - 1; i--) {
                a[down][i] = count++;
            }
            if (--down == up-1 && left == right+1) break;

            for (int i = down; i > up - 1; i--) {
                a[i][left] = count++;
            }
            if (++left == right+1 && up == down+1) break;

        }

        System.out.println("排查森林顺序如下");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}

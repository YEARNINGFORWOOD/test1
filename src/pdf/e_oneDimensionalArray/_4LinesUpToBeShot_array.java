package pdf.e_oneDimensionalArray;

import java.util.Scanner;
//4. 排队枪毙
//        小约参与了犹余游戏, 在这个游戏中最后活下来的人才能获得胜利.
//        游戏规则是这样的, n个玩家们围成一个圈, 从第一个玩家开始报数
//        报到m的人被枪毙, 下一个人接着从1开始报数.
//        直到最后一个活下来的人获得胜利.
//        小约现在开始选编号了, 已知参与的玩家数量为n, 被枪毙的数是m. 小约要选到几号位置才会活下来.
//        (1<m<n<100)
//        设计一个程序, 输入n和m, 输出最后的胜利者
//        样例输入: 10 3
//        样例输出: 4


public class _4LinesUpToBeShot_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("参与的玩家有多少？");
        int n = sc.nextInt();
        System.out.println("被枪毙的数是？");
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }
        for (int i = m-1; i <n-1; i=(i+m)%n) {
            for (int j =i; j <n-i; j++) {
                a[j] = a[j+1];
            }
            n--;
        }
        System.out.println(a[0]);

    }
}

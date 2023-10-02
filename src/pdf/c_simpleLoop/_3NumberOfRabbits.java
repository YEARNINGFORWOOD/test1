package pdf.c_simpleLoop;

import java.util.Scanner;

public class _3NumberOfRabbits {
    //    3. super家养了一对刚出生的兔子, 兔子出生第3月开始每月都会生一对小兔子, 小兔子出生后同样第3月开
//            始也会每月生一对兔子
//    super想知道 如果兔子不死 n月后家里会有多少对兔子
//    设计一个程序: 输入n, 输出兔子数量
//            (2<n<30)
//    样例输入: 7
//    样例输出:13
//    样例输入: 12
//    样例输出: 144
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f1 = 1;//1个月时兔子的对数
        int f2 = 1;//2个月时兔子的对数
        int result = 0;

        for(int i = 1; i <= n; i++){
            int f3 = f2 + f1;//当前月兔子的对数 = 上月兔子对数 + 上上月兔子的对数
//            1月 1对未成熟 0对成熟 1
//            2月 1对未成熟 0对成熟 1
//            3月 1(原本的数量) - 1(成熟的) + 1(出生的) = 1对未成熟 0(原本的) + 1(新成熟的) =1对成熟 1 + 1 = 2
//            4月 1 - 0 + 1 = 2对未成熟 1 + 0 = 1对成熟 2 + 1 = 3
//            5月 2 - 1 + 2 = 3对未成熟 1 + 1 = 2对成熟 3 + 2 = 5
//            6月 3 - 1 + 3 = 5对未成熟 2 + 1 = 3对成熟 5 + 3 = 8
//            7月 5 - 1 + 4 = 8对未成熟 3 + 2 = 5对成熟 8 + 5 = 13
            result = f1;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(result);
    }
}

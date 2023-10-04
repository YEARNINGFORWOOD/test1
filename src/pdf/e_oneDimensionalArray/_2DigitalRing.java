package pdf.e_oneDimensionalArray;
//2. 数字环
//        有一个长度为n的数字环, 将每个数字往后移动m位, 使其成为一个新的数字环
//        输入:
//        第一行: 整数n 表示有n个数字
//        第二行: n个整数Ni, 表示数字环的每个元素
//        第三行: 整数m 表示每个元素需要往后移动m位
//        输出: 移动后的新数字环
//        (1<=m<n<100, MIN_INT<Ni<MAX_INT)
//        样例输入:
//        10
//        1 2 3 4 5 6 7 8 9 10
//        2
//        样例输出:
//        9 10 1 2 3 4 5 6 7 8

import java.net.SocketOption;
import java.util.Arrays;
import java.util.Scanner;

public class _2DigitalRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入这个数字环有几个数字呀");
        int n = sc.nextInt();
        System.out.println("请给我数字环吧，我给你变个魔术O(∩_∩)O");
        int[] digitalRing = new int [n];
        int[] copy = new int [n];
        for (int i = 0; i < n; i++) {
            digitalRing[i] = sc.nextInt();
            copy[i] = digitalRing[i];
        }
        System.out.println("再随便给我一个数字，正常点哦`(*>﹏<*)′");
        int displacement = sc.nextInt();
        for (int i = 0; i < n-displacement; i++){
             digitalRing[i+displacement] = copy[i];
        }
        for (int i=0; i<displacement;i++){
             digitalRing[i] = copy[n-displacement+i];
        }
        System.out.println("挞塔~" + Arrays.toString(digitalRing) );
    }
}

package pdf.c_simpleLoop;

import java.util.Scanner;

public class _4Pinball {
    //    4. 云海学长为了探究神秘的物理现象, 从高楼抛下一个弹球 但由于高空抛物被警察抓了, 请各位小伙伴完
//    成他未完成的心愿
//    小球从某一高度落下，每次落地后反跳回原来高度的一半，再落下。
//    输入弹球的初始高度M和回弹次数N, 输出弹球第N次回弹后的高度 和达到该高度后所经过的距离(保留两位小
//                                                                                                 数)
//(0<M<2000, 0<N<50)
//    样例输入
//1000 5
//    样例输出
//31.25
//        2906.25
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        int N = sc.nextInt();
        double height = M;
        double sum = M;

        for (int i = 0; i < N; i++){
            height /=  2.0;
            sum += height * 2;
        }
        sum = sum - height;

        System.out.printf("第%d次回弹的高度为：%.2f\n" ,N,height);
        System.out.printf("经过的距离为：%.2f" ,sum);

    }

}

package pdf.b_judge;

import java.util.Scanner;

public class _3goToWork {
//    东东哥在上班途中, 可以选择走路和骑车两种方式
//    但他不清楚哪种方式比较快, 因为骑车需要找车, 开锁, 停车 需要耽搁很多时间.
//    设找到自行车, 开锁, 骑上自行车需要花27秒, 停车需要花23秒
//    步行每秒1.2米, 骑车每秒3.0米
//    给出东东哥距离公司的距离, 请问是骑车快还是走路快.
//            输入一个整数n, 表示到公司的距离
//    如果骑车快, 输出"骑车"
//    如果走路快, 输出"走路"
//    如果一样快, 输出"一样快"
//    样例输入:
//            60
//    样例输出:
//    走路

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //骑车耗时
        double rideTime = 27 + 23 + n / 3.0;
//        如果代码写成
//        double rideTime = 27 + 23 + n / 3;
//        那么就会有区别。
//        因为n是int类型,n/3会进行整数除法,结果也是整数。
//        比如n=60, n/3结果是20,不是准确的20.0。
//        然后与double类型的27和23相加,进行了隐式类型转换,变成了double类型。
//        但精度已经损失了。
//        所以最好的参数为:
//        double rideTime = 27 + 23 + n / 3.0;
//        这样n/3.0会进行准确的浮点数除法,结果是20.0,然后与27和23相加,精度就可以完全保留下来。
//        所以对于涉及小数的计算,最好都使用浮点数形式,以保证精度。

        //步行耗时
        double walkTime = n/1.2;

        if(rideTime < walkTime){
            System.out.println("骑车");
        } else if (rideTime > walkTime)
        {
            System.out.println("走路");
        }else {
            System.out.println("一样快");
        }

    }
}

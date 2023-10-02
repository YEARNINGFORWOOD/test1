package pdf.d_nestedLoop;

import java.util.Scanner;

public class _2findingPrimeNumbers {
    //    2. 求素数
//    设计一个程序, 输入N, 输出0~N之间的所有素数
//            (0<N<MAX_INT)
//    样例输入:
//            100
//    样例输出:
//            2
//            3
//            5
//            7
//            11
//            13
//            17
//            19
//            23
//            29
//            31
//            37
//            41
//            43
//            47
//            53
//            59
//            61
//            67
//            71
//            73
//            79
//            83
//            89
//            97
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("这个素数你想求到哪里？");
        int N = sc.nextInt();

        for (int i = 2; i < N; i++) {
            boolean isPrime = true;
            for (int j = 2 ; j < i ;j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }

        }
    }
}

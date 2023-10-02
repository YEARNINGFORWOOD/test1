package pdf.e_oneDimensionalArray;

import java.util.Scanner;

//1. 删除重复值
//        阿伟学长在开发一款游戏, 他希望玩家已经获得的道具会降低爆率, 避免玩家获得太多重复的道具
//        但玩家背包中道具是乱序且不确定的, 为了减小判断的运算量, 需要先对数据进行去重.
//        设计一个程序, 输入数据数量N, 以及N个整数Ni. 将该组数据去重后打印
//        (1<N<100, 0 <= Ni <= MAX_INT)
//        样例输入:
//        10
//        1 3 2 6 2 6 4 8 2 6
//        样例输出:
//        1 3 2 6 4 8
public class _1deleteDuplicateValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("废话不多说，告诉咱你有多少数据吧！");
        int N = sc.nextInt();
        int weaponDepot[] = new int[N];
        System.out.println("我还需要知道你的数据都有啥，告诉我一下吧！");
        for (int i = 0; i < N; i++) {
            weaponDepot[i] = sc.nextInt();
        }
        int deDuplication[] = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean repeated = false;
            for (int j=0; j < count;j++){
                if(weaponDepot[i] == deDuplication[j]) {
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                deDuplication[count++] = weaponDepot[i];
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(deDuplication[i]+" " );
        }

    }
}

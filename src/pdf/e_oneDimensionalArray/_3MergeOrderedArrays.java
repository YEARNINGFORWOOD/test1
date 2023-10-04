package pdf.e_oneDimensionalArray;
//3. 合并有序数组
//        阿伟学长终于写好了游戏背包1和背包2的排序算法, 但他发现将两个背包同时带上时, 还得合并一下排序.
//        阿伟学长懒得再写排序了, 希望小伙伴能帮帮他完成背包的合并.
//        设计一个程序, 输入两个有序数组, 输出一个合并后的有序数组.
//        输入:
//        第一行: 整数n,m 表示数组1和数组2分别有n,m个数字
//        第二行: n个整数Ni, 表示数组1的每个元素
//        第三行: m个整数Mi, 表示数组2的每个元素
//        6. 多维数组
//        (n,m<=100. 0<=Ni,Mi<=1000)
//        输出:
//        合并后的新数组
//        样例输入:
//        5 6
//        1 3 5 7 9
//        1 3 5 6 7 8
//        输出:
//        1 1 3 3 5 5 6 7 7 8 9

import java.util.Arrays;
import java.util.Scanner;

public class _3MergeOrderedArrays {

    //把M的所有元素，放入N元素后面，然后排序N
    public static int[] violentSolution(int n,int m,int[] array1,int[] array2){
        int temp = 0;
        for(int i=0;i < m;i++){
            array1[n+i] = array2[i];
        }
        //冒泡排序
        for (int i=0; i < m+n-1;i++){
            for (int j=0; j < m+n-1-i; j++){
                if(array1[j] > array1[j+1]){
                    temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
            }
        }
        return array1;
    }

    /**
     * 思路：
     * 从后往前
     * 利用2个数组都排好序的条件，从N的n开始往前遍历，从M的m开始往前遍历
     * 比较两个元素，谁大谁放在末尾，移动角标
     * 如果N用完了，直接把M剩余元素放入N的剩余位置中
     * 如何M用完了，直接返回
     */
    public static int[] doNotAnCreateArrayFromBackToFront(int n,int m,int[] array1,int[] array2){
        while (true){
            if (n == 0){
                for (int i = 0; i < m; i++){
                    array1[i] = array2[i];
                }
                break;
            }else if(m == 0){
                break;
            }
            /**这段代码报越界错误
             * 举例：
             * int[] arr = new int[6];
             * int x = arr[6];
             * 这就是越界的
             */
//            if (array1[n] < array2[m]){
//                array1[n+m] = array2[m--];
//            } else {
//                array1[n+m] = array1[n--];
//            }
            /**
             * 正确的如下
             */
            if (array1[n-1] < array2[m-1]){
                array1[n+m-1] = array2[(m--)-1];
            } else {
                array1[n+m-1] = array1[(n--)-1];
            }
        }
        return array1;
    }

    /**
     *思路
     * 克隆N数组，形成一个新的数组N1
     * 比较N1与M
     * 小的放入N数组
     * 移动角标
     * 如果N1用光了，直接把M放到N的后面
     * 如果M用光了，直接把N1放到N的后面
     */
    public static int[] createANewArrayFromFrontToBack(int n,int m,int[] array1,int[] array2){
        int[] N1 = new int[n];
        System.arraycopy(array1,0,N1,0,n);
        int i = 0;
        int j = 0;
        int z = 0;
        while (true){
            if (i == n-1){
                System.arraycopy(array2,j,array1,i+j,m-j);
                break;
            } else if (j == m-1) {
                System.arraycopy(N1,i,array1,i+j,n-i);
                break;
            }

            if (N1[i] < array2[j]){
                array1[z++] = N1[i++];
            }else {
                array1[z++] = array2[j++];
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        System.out.println("打仗去啦，咱把收集的两个战利品背包合并排序一下把ψ(｀∇´)ψ");
        System.out.println("你的俩个战利品背包都分别有多少个物品？");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("好嘞，那我还不知你的背包里都有啥呢呀，告诉我呗<(￣︶￣)↗[GO!]");
        System.out.println("第一个背包：");
        int[] N = new int[n+m];
        int[] M = new int[m];
        int[] result = new int[n+m];
        for (int i=0; i<n; i++){
            N[i] = sc.nextInt();
        }
        System.out.println("第二个背包：");
        for (int i=0; i<m; i++){
            M[i] = sc.nextInt();
        }

//        //暴力解法
//        result = violentSolution(n,m,N,M);
//        //不新建数组（从后往前）
//        result = doNotAnCreateArrayFromBackToFront(n,m,N,M);
        //新建数组（从前往后）
        result = createANewArrayFromFrontToBack(n,m,N,M);
        System.out.println(Arrays.toString(result));
    }

}


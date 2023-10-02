package pdf.a_operator;

import java.util.Scanner;

public class _1Split {
    public static void main(String[] args) {
            System.out.println("请输入一个三位数(0<a<1000)");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int bai = a/100;
            int shi = (a/10)%10;
            int ge = a%10;
            System.out.println("百位是" + bai);
            System.out.println("十位是" + shi);
            System.out.println("个位是" + ge);
    }
}

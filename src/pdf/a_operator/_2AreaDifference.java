package pdf.a_operator;

import java.util.Scanner;

public class _2AreaDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入整数l");
        float l = scanner.nextInt();
        float squareArea = l * l;
        double circularArea = (l/2) * (l/2) * 3.14;
        double differenceInArea = squareArea - circularArea;
        System.out.println("面积之差为" + differenceInArea);
    }
}

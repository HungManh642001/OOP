package hungmanh.section2.main;

import java.util.Scanner;

public class MainMaxMin {
    public static void main(String[] args) {
        System.out.println("Nhap 3 so a, b, c:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println("So lon nhat la:"+max);
        double min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println("So nho nhat la:"+min);

    }
}

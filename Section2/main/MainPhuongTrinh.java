package hungmanh.section2.main;

import java.util.Scanner;

public class MainPhuongTrinh {
    public static void main(String[] args) {
        System.out.println("Nhap vao 3 so a, b, c: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0){
            System.out.println("Phuong trinh co nghiem la: " + -b/c);
        } else {
            double delta = Math.pow(b, 2) - 4*a*c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0){
                System.out.println("Phuong trinh co nghiem kep la: "+-b/(2*a) );
            } else{
                double x1 = (b+Math.sqrt(delta))/(2*a);
                double x2 = (b-Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem la: " + x1 +", " +x2);
            }
        }
    }
}

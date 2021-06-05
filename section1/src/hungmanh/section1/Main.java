package hungmanh.section1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Nhập x: ");
        x = scanner.nextDouble();
        System.out.println("Nhập y: ");
        y = scanner.nextDouble();
        System.out.println(x+ " + " +y+" = " + TinhToan.tong(x, y));

        //
        System.out.print("Nhap canh hinh vuong: ");
        double a = scanner.nextDouble();
        System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTich(a));
    }
}



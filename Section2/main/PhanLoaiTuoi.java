package hungmanh.section2.main;

import java.util.Scanner;

public class PhanLoaiTuoi {
    public static void main(String[] args) {
        System.out.println("Vui long nhap vao so tuoi:");
        Scanner scanner = new Scanner(System.in);
        tuoi(scanner.nextInt());
    }

    public static void tuoi(int age) {
        if (age < 1) {
            System.out.println("Tre so sinh");
        } else if (age >= 1 && age <= 3) {
            System.out.println("Em be");
        } else if (age > 3 && age < 18) {
            System.out.println("Tre em");
        } else if (age == 18) {
            System.out.println("Nguoi lon");
        } else if (age > 40 && age < 60) {
            System.out.println("Trung nien");
        } else {
            System.out.println("Nguoi gia");
        }

    }
}

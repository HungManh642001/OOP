package hungmanh.section2.main;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        System.out.println("Bac Ho sinh nam bao nhieu?");
        System.out.println("A. 1891 \nB. 1889 \nC. 1890 \nD. Khong dap an nao dung");

        Scanner scanner = new Scanner(System.in);
        String luachon = scanner.nextLine();

        switch (luachon.charAt(0)){
            case 'A':
            case 'a':
            case 'B':
            case 'b':
            case 'D':
            case 'd':
                System.out.println("Dap an khong chinh xac!");
                break;
            case 'C':
            case 'c':
                System.out.println("Dap an chinh xac!");
                break;
            default:
                System.out.println("Dap an khong co trong cau hoi!");
                break;

        }

    }
}

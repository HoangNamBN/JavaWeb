package laptrinhtrianh.haquyduc.Buoi1;
import java.util.Scanner;

// ctrl + alt + L

public class BTVN_SoChinhPhuong {
    public static boolean KiemTraSoChinhPhuong(double number) {
        double numberCheck = Math.sqrt(number);
        return (numberCheck - (int) numberCheck == 0);
    }
    public static void main(String[] args) {
        // nhập biến number kiểu dữ liệu double bằng cách sử dụgn scanner
        System.out.println("Nhập số cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        // để đóng lại các chương trình
        scanner.close();
        if (KiemTraSoChinhPhuong(number)) System.out.println(number + " là số chính phương!");
        else System.out.println(number + " không là số chính phương!");
    }
}
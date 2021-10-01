package laptrinhtrianh.haquyduc.Buoi1;

import java.util.Scanner;

public class HelloWorld {
    // viết tắt psvm
    public static void main(String[] args) {
        /// viết tắt sout
        System.out.println("HelloWorld !");
        // thuật toán algorithm
        // kiểu dữ liệu => số nguyên, số thực(số thập phân float b = 7.0f), bool: kiểu dữ liệu đúng sai; kiểu dữ liệu double
        // ép kiểu: thêm (kiểu dữ liệu cần ép)
        int a = (int) 0.7f;
        System.out.println("a = "+ a);

        // Bài toán: check 1 số bất kỳ có phải số chính phương hay không
        // 1. số chính phương là gì ? Math.sqrt(a)
        System.out.println("Nhập số cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double x = Math.sqrt(number);
        int x2 = (int)x;
        if(x-x2 == 0) System.out.println(number + " là số chính phương !");
        else System.out.println(number + " không là số chính phương!");

















    }
}

package LapTrinhTriAnh;

import java.util.Scanner;

public class Bai5 {
    public static int fibonaci(int n) {
        int fibonaci = 0;
        if (n < 0) return -1;
        else if(n == 1 || n == 0) return 1;
        else return fibonaci(n - 1) + fibonaci(n-2);
    }
    public static void main(String[] args) {
        // biến nằm trong stack -> phân vùng bộ nhớ được giải phóng, code được tối ưu nhất
        System.out.println("Nhập số lượng số fibonaci cần xử lý: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fibonaci(n);
        System.out.println("Số Fibonaci thứ " + n + " là: " + result);
    }
}

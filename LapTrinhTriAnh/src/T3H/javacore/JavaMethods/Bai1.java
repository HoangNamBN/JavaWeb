package T3H.javacore.JavaMethods;

import java.util.Scanner;

public class Bai1 {
    public static void TinhToan() {
        float a, b, tong, hieu, tich, thuong;
        System.out.print("Nhập a = ");
        a = nhap();
        System.out.print("Nhập b = ");
        b = nhap();
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        if (b == 0) {
            thuong = 0;
        } else {
            thuong = a / b;
        }
        System.out.println("Tổng 2 số: " + tong);
        System.out.println("Tổng 2 số: " + hieu);
        System.out.println("Tổng 2 số: " + tich);
        System.out.println("Tổng 2 số: " + thuong);

    }

    public static float nhap() {
        Scanner scanner = new Scanner(System.in);
        float n;
        while (true) {
            // try catch dùng để bắt lỗi
            try {
                // thực hiện lệnh tiếp theo
                n = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Nhập lại giá trị cho a và b: ");
                scanner.nextLine();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        TinhToan();
    }
}

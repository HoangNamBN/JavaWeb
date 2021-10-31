package LapTrinhTriAnh;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhâp vào số nguyên dương a = ");
        int a = CheckInput();
        System.out.print("Nhập vào số nguyên dương b = ");
        int b = CheckInput();
        System.out.println("Ước chung lớn nhất của hai số " + a + " và " + b + " là: " + UCLN(a, b));
    }

    public static int CheckInput() {
        boolean check = false;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (!check) {
            try {
                n = scanner.nextInt();
                if (n > 0) check = true;
                else {
                    System.out.println("Xin mời nhập vào một số nguyên dương");
                    scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Xin mời nhập vào một số nguyên dương");
                scanner.nextLine();
            }
        }
        return n;
    }

    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}

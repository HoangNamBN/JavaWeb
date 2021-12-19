package LapTrinhTriAnh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số nguyên n = ");
        int n = CheckInput();
        if (checkSoNguyenTo(n)) System.out.println(n + " là số nguyên tố!");
        else System.out.println(n + " không là số nguyên tố!");
    }

    public static int CheckInput() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = scanner.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập vào số nguyên. Xin mời nhập lại!");
                scanner.nextLine();
            }
        }
        return n;
    }

    public static boolean checkSoNguyenTo(int n) {
        if (n < 2) return false;
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

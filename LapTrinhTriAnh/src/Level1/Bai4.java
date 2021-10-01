package Level1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số nguyên n = ");
        int n = CheckInput();
        int dem = 0;
        int i = 2;
        System.out.print(n + " số nguyên tố đầu tiên là: ");
        while (dem < n) {
            if (CheckSNT(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    public static int CheckInput() {
        int n = 0;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        while (!check) {
            try {
                n = scanner.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Xin mời nhập vào số nguyên");
                scanner.nextLine();
            }
        }
        return n;
    }

    public static boolean CheckSNT(int n) {
        if (n < 2) return false;
        int canBacHai = (int) Math.sqrt(n);
        for (int i = 2; i <= canBacHai; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
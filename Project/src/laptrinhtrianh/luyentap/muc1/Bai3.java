package laptrinhtrianh.luyentap.muc1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số nguyên n = ");
        int n = CheckInput();
        PhanTichSNT(n);
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
    public static void PhanTichSNT(int n){
        String result = " ";
        System.out.print("Số " + n + " được phân tích thành ");
        for(int i = 2; i <= n; i++){
            while (CheckSNT(i) && n%i == 0){
                result = result + i + " x ";
                n /= i;
            }
        }
        result = result.trim();
        result = result.substring(0, result.length() - 1);
        System.out.print(result);
    }
}

package laptrinhtrianh.luyentap.muc1;

public class Bai7 {
    public static void main(String[] args) {
        int n = 0;
        for (n = 10000; n <= 9999999; n++) {
            if (isThuanNghich(n) && isSNT(n)) {
                System.out.print(n + "; ");
            }
        }
    }

    public static boolean isThuanNghich(int n) {
        StringBuilder str = new StringBuilder(String.valueOf(n));
        int checkThuanNghich = Integer.parseInt(str.reverse().toString());
        if (n == checkThuanNghich) return true;
        return false;
    }

    public static boolean isSNT(int n) {
        if (n < 2) return false;
        int canBacHai = (int) Math.sqrt(n);
        for (int i = 2; i <= canBacHai; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
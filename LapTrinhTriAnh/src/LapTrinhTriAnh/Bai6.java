package LapTrinhTriAnh;

public class Bai6 {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.print("Các số nghịch đảo lần lượt là: \n");
        for (n = 100000; n <= 999999; n++) {
            if (CheckSoThuanNghich(n)) {
                System.out.print(n + "; ");
                count++;
            }
        }
        System.out.println("\n" + "Có " + count + " số thuận nghịch có 6 chữ số");
    }

    public static boolean CheckSoThuanNghich(int n) {
        StringBuilder str = new StringBuilder();
        str.append(n);
        String checkThuanNghich = str.reverse().toString();
        String covertStr = String.valueOf(n);
        if (covertStr.equals(checkThuanNghich)) return true;
        else return false;
    }
}

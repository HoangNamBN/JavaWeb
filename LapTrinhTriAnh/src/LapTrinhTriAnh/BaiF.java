package LapTrinhTriAnh;

import java.math.BigInteger;
import java.util.Scanner;

public class BaiF {
    public static void main(String[] args) {
        // alt tab: chuyển màn hình

        // BigInteger: dùng cho số nguyên
        String s = new Scanner(System.in).nextLine();
        BigInteger number1 = new BigInteger(s);
        BigInteger number2 = new BigInteger("872312");
        System.out.println(number1.divide(number2));

        // BigDecimal: dùng cho số thập phân thường dùng trong mySql
    }
}

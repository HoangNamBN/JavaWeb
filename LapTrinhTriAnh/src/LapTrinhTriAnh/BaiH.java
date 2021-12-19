package LapTrinhTriAnh;
import java.util.*;

public class BaiH {
    public static void main(String[] args) {
        BaiH baiH = new BaiH();
        baiH.nhap();
    }

    private void nhap() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++){
            String s = scanner.nextLine();
            String ketQua = xuLy(s);
            System.out.println(ketQua);
        }
    }

    private String xuLy(String s) {
        int dem = 0;
        for(int i = 0; i < s.length(); i++){
            int soLanLapLai = 1;
            for(int j = 1; j < s.length() - i; j++)
            if(s.charAt(i) != s.charAt(i + j)){
                soLanLapLai = j;
                break;
            }
            System.out.println(soLanLapLai + s.charAt(i));
        }
        return " ";
    }
}
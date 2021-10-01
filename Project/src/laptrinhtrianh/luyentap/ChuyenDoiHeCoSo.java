//Bài 2:
//- Input: số tự nhiên n ở hệ cơ số 10
//- Output: số ở hệ cơ số b với 1 < b <= 36
// Cách chuyển đổi:
//10 -> 2 : lấy phần nguyên chia cho 2 đến khi nào kết quả phần nguyên bằng 0 sau đó đọc ngược từ dưới lên
//10 -> 8: lấy phần nguyên chia cho 8 đến khi nào kết quả phần nguyên bằng = 0 thì đọc ngược lại
//10 -> 16: thì lấy 31 chia cho 16 tương tự như trên nhưng từ 1 đến 15 thì 15 tương đương với A
//vậy t cần lưu 1 mảng các kí tự đại diện

package laptrinhtrianh.luyentap;
import java.util.Scanner;
public class ChuyenDoiHeCoSo {
    public static int ScannerInput(){
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check)
        {
            try
            {
                n = scanner.nextInt();
                check = true;
            }
            catch (Exception e)
            {
                System.out.println("Bạn cần nhập vào số nguyên");
                scanner.nextLine();
            }
        }
        return n;
    }
    public static String ChuyenHeSo(int n, int b){
        String str = " ";
        int x = 0;
        while (n > 0)
        {
            x = n %b;
            n = n/b;
            if(b == 16){
                if(x == 10) str += "A";
                if(x == 11) str += "B";
                if(x == 12) str += "C";
                if(x == 13) str += "D";
                if(x == 14) str += "E";
                if(x == 15) str += "F";
                if(0 <= x && x < 10) str += x;
            }
            else str+=x;
        }
        return str;
    }
    public static void HienThiKetQua(String str)
    {
        for (int i = 0; i < str.length(); i++)
            System.out.print(str.charAt(str.length() - i - 1));
    }
    public static void main(String[] args) {
        System.out.print("Nhập số n = ");
        int n = ScannerInput();
        System.out.print("Nhập hệ số cần chuyển: ");
        int b = ScannerInput();
        String output = ChuyenHeSo(n, b);
        System.out.print("Giá trị " + n+ " chuyển từ hệ 10 sang hệ " + b + " là: ");
        HienThiKetQua(output);
    }
}

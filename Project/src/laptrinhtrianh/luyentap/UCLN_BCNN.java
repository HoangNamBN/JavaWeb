package laptrinhtrianh.luyentap;
// viết chương trình tìm ước chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b
// phân tích thuật toán: phải hiểu thế nào là ước chung lớn nhất
// Hướng đi: đầu tiên là việc nhập dữ liệu thì bắt buộc phải nhập số
// tiếp theo là tìm ước chung : bằng cách lặp đi lặp lạid dến khi nào a == b thì dừng
// bội chung nhỏ nhất = tích 2 số / UCLN
import java.util.Scanner;

public class UCLN_BCNN
{
    public static int ScannerInput()
    {
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
                System.out.println("Bắt buộc nhập chữ số vui lòng nhập lại");
                // là một phương thức dùng để nhận giá tri nhập từ bàn phím
                scanner.nextLine();
            }
        }
        return n;
    }

    public static int UCLN(int a, int b)
    {
        while (a!=b)
        {
            if(a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println("Nhập a = ");
        int a = ScannerInput();
        System.out.println("Nhập b = ");
        int b = ScannerInput();
        System.out.println("Ước chung lớn nhất của 2 số " + a + " và " +b+ " là: " + UCLN(a, b));
        System.out.println("Bội chung nhỏ nhất của số " + a + " và " + b+ " là: " + (a*b)/UCLN(a, b));
    }
}
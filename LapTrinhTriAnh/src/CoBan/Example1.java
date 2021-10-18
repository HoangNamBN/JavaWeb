package CoBan;

import java.util.Scanner;

// input : str = "Ha Quy Duc"
// output: có phải họ Hà hay không?
public class Example1 {

    public static void CoutU(){
        String str = "Ha Quy Duc";
        if(str.startsWith("Nam")) System.out.println("OK");
        else System.out.println("Not OK");
    }
    // int : có trả về
    public static int checkInput(){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        // đúng sai
        boolean check = false;
        while (!check){
            // try catch: ngoại lệ
            // nếu dúng nhảy vào try, nếu sai nhảy vào catch và yêu cầu nhập lại
            try {
                n = scanner.nextInt();
                check = true;
            }catch (Exception e){
                System.out.println("bạn hãy nhập lại là số nguyên: ");
                scanner.nextLine();
            }
        }
        return n;
    }
    // void: không trả về không có return
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15;
        int[] a = new int[]{9, 8, 123, 7,11, 14, 18, 21, 399, 10,5,4,1,2,3};
        System.out.print("Nhập giá trị: ");
        int dem = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0)
            {
                dem++;
                continue;
            }
            boolean check = false;
            for(int j = 0; j < i; j++)
            {
                if((a[j] > a[i]))
                {
                    check = true;
                    break;
                }
            }
            if(check == false) dem++;
        }
        System.out.print("Số phần tử lớn hơn trước nó: " + dem);
    }
}

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
//        CoutU();
        System.out.println("Nhập n = ");
        int n = checkInput();
    }
}

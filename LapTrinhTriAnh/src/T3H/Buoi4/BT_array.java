package T3H.Buoi4;

import java.util.Scanner;

public class BT_array {
    public static void main(String[] args) {
        int []arr;
        int n;
        System.out.print("Nhập số lượng phần tử");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        nhap(arr, n);
        hienThi(arr, n);
    }

    // nhập mảng
    public static void nhap(int []arr, int n){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i ++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    // hiển thị
    public static void hienThi(int []arr, int n){
        System.out.print("Phần tử trong mảng lần lượt là: " );
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

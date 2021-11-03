package T3H.Buoi4;

import java.util.Scanner;

public class BT {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        nhap(arr, n);
        maxMin(arr, n);
        hienThi(arr, n);
        sapxep(arr, n);
        System.out.println("Mảng sau khi sắp xếp");
        hienThi(arr, n);
    }

    public static void nhap(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    public static void hienThi(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void maxMin(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

    public static void sapxep(int []a, int n) {
        for (int i = 0; i < n -1; i++)
            for (int j = i +1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
    }
}

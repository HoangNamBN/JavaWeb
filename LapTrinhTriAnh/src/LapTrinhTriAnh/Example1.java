package LapTrinhTriAnh;

import java.util.Scanner;

public class Example1 {
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
package CauHoiPhongVan.ArrrayJava;

import java.util.Scanner;

public class MangTrongJava {
    private static int[] a = new int[]{1, 5, 6, 2, 9, 10, 4};

    // sắp xếp mảng tăng dần, giảm dần


    public static void main(String[] args) {
        sapTangdan(a);
        sapGiamdan(a);
    }

    public static void sapTangdan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int items: a) {
            System.out.println(items);
        }
    }
    public static void sapGiamdan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j]>a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int items: a) {
            System.out.println(items);
        }
    }
}

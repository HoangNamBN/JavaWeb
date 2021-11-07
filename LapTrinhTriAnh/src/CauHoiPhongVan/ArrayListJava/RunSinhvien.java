package CauHoiPhongVan.ArrayListJava;

import java.util.ArrayList;
import java.util.Scanner;

public class RunSinhvien {
    static ListSinhvien listSinhvien = new ListSinhvien();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        ArrayList<Sinhvien> sinhviens = listSinhvien.nhapsinhvien(n);
        listSinhvien.HienThi(sinhviens);
    }
}

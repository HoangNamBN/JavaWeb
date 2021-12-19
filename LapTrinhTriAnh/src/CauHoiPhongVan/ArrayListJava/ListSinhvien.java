package CauHoiPhongVan.ArrayListJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSinhvien {
    public static ArrayList<Sinhvien> nhapsinhvien(int n){
        ArrayList <Sinhvien> sinhviens = new ArrayList<Sinhvien>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i ++){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.print("Nhập id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhâp tên sinh viên");
            String name = sc.nextLine();
            Sinhvien sinhvien = new Sinhvien(id, name);
            sinhviens.add(sinhvien);
        }
        return sinhviens;
    }
    public static void HienThi(ArrayList<Sinhvien> arrayList){
        for (Sinhvien a:arrayList) {
            System.out.println(a.toString());
        }
    }
}

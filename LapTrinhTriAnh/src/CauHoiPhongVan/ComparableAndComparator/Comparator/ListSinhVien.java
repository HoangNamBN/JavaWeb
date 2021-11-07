package CauHoiPhongVan.ComparableAndComparator.Comparator;

import java.util.*;

public class ListSinhVien {
    public static void main(String[] args) {
        List<Sinhvien> sinhvienList = new ArrayList<>();
        sinhvienList.add(new Sinhvien(2, "Nam"));
        sinhvienList.add(new Sinhvien(1, "Đức"));
        sinhvienList.add(new Sinhvien(4, "Linh"));
        sinhvienList.add(new Sinhvien(3, "Huy"));

        // gọi hàm sắp xếp
        Collections.sort(sinhvienList, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Sinhvien sinhvien:sinhvienList) {
            System.out.println(sinhvien.toString());
        }
    }
}

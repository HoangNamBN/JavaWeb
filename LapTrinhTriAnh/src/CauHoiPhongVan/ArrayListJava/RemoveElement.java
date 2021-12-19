package CauHoiPhongVan.ArrayListJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        // tạo ra 1 mảng phần tử
        List<Integer> numberlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numberlist.add(sc.nextInt());
        }
        // ở mảng thì array[index] còn list thì dùng hàm get(index)
        System.out.print("List sau khi nhập là: ");
        for (int i = 0; i < numberlist.size(); i++) {
            System.out.print(numberlist.get(i) + " ");
        }

        // xóa các phần tử trùng nhau trong arraylist
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < numberlist.size(); i++) {
            if (!numList.contains(numberlist.get(i))) {
                numList.add(numberlist.get(i));
            }
        }
        System.out.println();
        System.out.print("List sau khi xóa phần tử trùng nhau là: ");
        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i) + " ");
        }

        // Cách hiển thị khác là dùng foreach()
        System.out.println();
        System.out.print("List sau khi xóa phần tử trùng nhau là: ");
        for (Integer element:numList){
            System.out.print(element + " ");
        }
    }
}

package CauHoiPhongVan.ArrrayJava;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void nhapsinhvien(Student[] students, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ" + (i + 1));
            students[i] = new Student();
            System.out.println("Nhập mã sinh viên");
            students[i].setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập tên sinh viên: ");
            students[i].setName(scanner.nextLine());
        }
    }

    public static void hienThiTT(Student[] student, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-20s\n", student[i].getId(), student[i].getName());
        }
    }

    public static void soSanh(Student[] students, int n) {
        Student temp = students[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getId() > students[j].getId()) {
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        hienThiTT(students, n);
    }


    public static void main(String[] args) {
        System.out.println("Nhập số lượng sinh viên");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        nhapsinhvien(students, n);
        hienThiTT(students, n);
        soSanh(students, n);
    }
}

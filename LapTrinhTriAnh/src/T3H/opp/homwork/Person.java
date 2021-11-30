package T3H.opp.homwork;

import java.util.Locale;
import java.util.Scanner;

class Person {
    // khai báo các thuộc tính của lớp
    protected String name;
    protected String sex;
    protected String adrress;
    protected String ngaysinh;

    public void intputPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten :");
        this.name = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        this.sex = scanner.nextLine();
        System.out.println("Nhap dia chi");
        this.adrress = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        this.ngaysinh = scanner.nextLine();
    }

    public void showPerson() {
        System.out.println("Ho Ten : " + this.name + "\nGioi Tinh : " + this.sex + "\nDia chi : " +
                this.adrress + "\nNgay sinh : " + this.ngaysinh);
    }
}

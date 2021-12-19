package CauHoiPhongVan.StringJava;

public class Kitu {
    public String name = "Duc";

    public static void main(String[] args) {
        Kitu kitu = new Kitu();
        int a = timKiTu(kitu.name);
        System.out.println(a);
    }

    public static int timKiTu(String name) {
        int vitri = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'c') {
                vitri = i;
                break;
            }
        }
        return vitri;
    }
}

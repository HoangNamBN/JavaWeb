package CoBan;

public class ExampleString {
    public static void main(String[] args) {
        // khai báo 1 string
        String str = "Hà Qúy Đức";
        // 1. Hàm charAt:
        System.out.println("Chữ cái mình cần lấy tại vị trí index: " + str.charAt(0));
        // 2. Hàm lenght()
        System.out.println("Lenght: " + str.length());
        System.out.println("kÍ TỰ CUỐI CÙNG: " + str.charAt(str.length() - 1));
        // 3. Hàm isEmpty(): trả về true nếu rỗng
        System.out.println(str.isEmpty());
        // 4.Hàm substring(int index)
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(2));
        // 5. Hàm trim(): xóa
        System.out.println("Chuỗi sau khi xóa đầu và cuối: " + str.trim());
        // 6. Thay đổi chuỗi: replace()
        System.out.println("Chuỗi sau khi thay đổi: " + str.replace("Hà", "Đoàn Huy Đức"));
        // 7. hàm chuyển từ hoa -> thường, thường -> hoa
        System.out.println("Chuỗi sau khi viết thường: " + str.toLowerCase());
        System.out.println("Chuỗi sau khi viết thường: " + str.toUpperCase());
        // so sánh 2 chuỗi đầu vào ASCII A -->
        String str1 = "ABCD  ABCD";
        String str2 = "ABcD";
        System.out.println(str1.compareTo(str2));
        // Nối chuỗi
        String str3 = str1 + " " + str2;
        System.out.println(str3.concat(str1));
        // Số điện thoai: 0398727881     Email: nguyenvannamtgdd35@gmail.com
        // công ty: ABC
        // Hàm kiểm tra tồn tại giá trị
        if(str.contains("Công ty")) System.out.println("Bỏ qua");
        else System.out.println("Lấy");

        int a = 5;
        // Interger.PartInt
        //conver int -> float
        double b = (double)a;
        // chuyển số --> string
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        System.out.println(b);
    }
}

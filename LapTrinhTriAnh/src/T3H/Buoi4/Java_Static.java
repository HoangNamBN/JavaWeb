package T3H.Buoi4;

public class Java_Static {
    public static int a = 4;
    public static int b = 5;

    public final int e = 10;

    public int d = 5;

    public int getD(){
        return this.d;
    }

    // 1 đối tượng hay 1 class nó bao gồm methods và thuộc tính
    // cách khai báo functions  tương được với methods
    // methods nó thể hiện hành vi cho đối tượng
    // ví dụ : con chó có màu sắc, giống chó
    // con chó: sủa, ăn, chạy, ...
    // thì con chó: đối tượng object
    // màu sắc, giống chó: thuộc tính của đối tượng
    // hành động: sủa,, chạy, ăn thì hành động của đối tượng object
    // hanhf động sẽ được thể hiển qua methods

    // functions: cách khai báo
//    public [void | kiểu dữ liệu trả về] (tên hàm){
//
//    }



    public void ShowResult() {
        int e = 7;
        int c = a +b;
        System.out.println(c);
    }
    public static int ShowResult1() {
        int c = a +b;
//        System.out.println(c);
        // không có return;
        return c;
    }



    public String Show(){
//        int c = a + b;
        String a = "Đức";
        String b = "Anh";
        String c = a + b;
        // có kiểu trả về
        return c;
    }
}

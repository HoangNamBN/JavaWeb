package CauHoiPhongVan.ThisJava;

public class KeyThis {
    private int id;
    private String name;

    public KeyThis(){
        System.out.println("Đây là constructor mặc định");
    }

    public KeyThis(int id, String name){
        // ý 2: gọi đến phương thức của lớp hiện tại
        this();
        // ý 1: tham chiếu tới biến của lớp hiện tại
        this.id = id;
        this.name = name;
    }

    public void A(){
        System.out.println("Đây là phương thức A");
    }

    // gọi phương thức trong lớp hiện tại
    public void B(){
        this.A();
    }


}

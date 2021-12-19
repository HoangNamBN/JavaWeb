package CauHoiPhongVan.OverrideMethods;

public class Main {
    public static void main(String[] args) {
        // khởi tạo 1 tham chiếu kiểu CBird là cBird tham chiếu tới đối tượng là CParrot
        CBird cBird = new CParrot();
        cBird.getInfo();
    }
}

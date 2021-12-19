package LapTrinhTriAnh;
// java là ngôn ngữ lập trình hướng đối tượng
// đối tượng được định nghĩa cụ thể bởi các đặc điểm, tượng trưng cho sự vật thì được gọi là 1 đối tượng
// hướng đối tượng: tạo 1 lớp có các thuộc tính cụ thể đặc trưng cho đối tượng đó
// đối tượng luôn gắn với public hoặc private để xem đối tượng đó dùng được trong những class nào?
// tác động đến đối tượng bằng cách:
public class StudentClass {
    // nếu mà tồn tại thuộc tính của đối tượng khác thì nên khai báo như sau:
    // ví dụ sách có thuộc tính nhà xuất bản thì ở class sách nên khai báo là:
    // private NhaXuatBan nhaxuaban; và ở class nhà xuất bản cũng có thuộc tính tên xuất bản, ...
    private int id;
    private int age;
    private String name;
    private int sex;

    // contructor: Alt + insert
    // hàm tạo có tham số
    public StudentClass(int id, int age, String name, int sex){
        // this.thuộc tính để lấy thuộc tính của đối tượng, còn biến bên phải là một biến hoàn toàn khác
        this.id = id;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    // hàm tạo không tham số
    public StudentClass(){

    }
    // đối tượng có tính đa hinh và tính bao đóng
    // tính đa hình: là các đối tượng khác nhau nhưng lại có phương thức giống nhau
    // tính đa hình đi cùng 2 từ là abtract/ interface
    // tính bao đóng: là gán các thuộc tính là private
    // trừu tượng hóa: là nhìn từ mắt thường và chuyển thành code từ các đặc điểm

    // tính kế thừa: đơn giản là thêm từ khóa extends

    // cho phép lấy thông tin tuổi và lấy thông tin tên

    // phương thức là abstract thì lớp cũng phải abstract
    // abstract

    public String setTen(String name){
        return name;
    }
}

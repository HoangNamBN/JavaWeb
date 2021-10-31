package LapTrinhTriAnh;

import java.io.*;

// để xử lý file trước tiên phải
public class FileProcessing {
    public static void main(String[] args) {
        // class hỗ trợ chuyển dữ liệu của mình -> string để lưu vào phân vùng ổ đĩa
        try {
            File file = new File("JavaBasic/src/JavaBasic/processingfile");
            // OutputStream: thằng này là abstract class
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
//            outputStream.write("xxxxx");
//            outputStream.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("abc");
            // có tác dụng xuống dòng
            bufferedWriter.newLine();
            bufferedWriter.write("cde");
            // đóng file: nếu không đóng file thì nó sẽ lám sao?
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

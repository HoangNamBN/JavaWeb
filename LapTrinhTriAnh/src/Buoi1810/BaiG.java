package Buoi1810;

import java.util.Scanner;

public class BaiG {
    int n;
    int[][] a = new int[1000][1000];
    int[][] b = new int[1000][1000];

    void scannerInput(Scanner scanner) {
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) { // duyệt hàng
            a[i] = new int[n]; // cấp phát ô nhớ
            for (int j = 0; j < n; j++) { // duyệt cột
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) { // duyệt hàng
            b[i] = new int[n]; // cấp phát ô nhớ
            for (int j = 0; j < n; j++) { // duyệt cột
                b[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        BaiG baiG = new BaiG();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bộ test: ");
        int soBoTest = scanner.nextInt();
        System.out.print("Nhập n = ");
        for (int k = 0; k < soBoTest; k++) {
            baiG.scannerInput(scanner);
            baiG.process();
        }
    }

    private void process() {
        for (int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                if(a[i][j] == b[i][j]){
                    System.out.print(i + " " + j + "\n");
                }
            }
        }
    }
}

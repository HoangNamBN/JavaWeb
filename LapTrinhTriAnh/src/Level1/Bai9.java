package Level1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bai9 {
    static int n = 0;
    static int[] snt = new int[10000];
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("LapTrinhTriAnh/Data/SoNguyenTo.txt"));
        while (scanner.hasNext())
        {
            try {
                int a = scanner.nextInt();
                if(isSNT(a))
                {
                    if(isSame(a))
                    {
                        snt[n] = a;
                        n ++;
                    }
                }
            }
            catch (NoSuchElementException a)
            {
                break;
            }
        }
        System.out.print("Số lượng số nguyên tố khác nhau " + n);
    }

    static boolean isSame(int a) {
        for(int i = 0; i < n; i ++)
        {
            if(snt[i] == a) return false;
        }
        return true;
    }

    static boolean isSNT(int n)
    {
        if (n < 2) return false;
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

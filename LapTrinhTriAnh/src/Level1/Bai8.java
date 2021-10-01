package Level1;

public class Bai8 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1000000; i <= 9999999; i++) {
            if (isSNT(i) && isAllPrimeNumber(i) && isDecrease(i)) {
                System.out.print(i + "; ");
            }
        }
    }

    public static boolean isSNT(int n) {
        if (n < 2) return false;
        int canBacHai = (int) Math.sqrt(n);
        for (int i = 2; i <= canBacHai; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isAllPrimeNumber(int n) {
        int a[] = new int[n];
        int i = 0;
        while (n > 0) {
            a[i] = n % 10;
            n /= 10;
            i++;
        }
        for (int j = 0; j < i; j++) {
            if (!isSNT(a[j])) return false;
        }
        return true;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static boolean isDecrease(int n) {
        String[] str = String.valueOf(n).split("");
        int[] intArr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            intArr[i] = Integer.parseInt(str[i]);
        }
        if (isSorted(intArr)) return true;
        return false;
    }
}

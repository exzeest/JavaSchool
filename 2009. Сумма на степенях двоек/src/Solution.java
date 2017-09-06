import java.util.Scanner;

public class Solution {
    public static boolean IsPowerOfTwo (int value) {
        if (value < 1) return false;
        return ((value & (value - 1)) == 0);
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int summ = 0;
        int n = scanner.nextInt ();
        for (int i = 1; i <= n; ++i) {
            int nextValue = scanner.nextInt ();
            if (IsPowerOfTwo (i)) summ += nextValue;
        }
        System.out.println (summ);
    }
}

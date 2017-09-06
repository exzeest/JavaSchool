import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int min = scanner.nextInt ();
        int countOfMin = 1;
        int nextValue;
        for (int i = 1 ; i < n ; ++i) {
            nextValue = scanner.nextInt ();
            if (min == nextValue) ++countOfMin;
            if (nextValue < min) {
                min = nextValue;
                countOfMin = 1;
            }
        }
        System.out.println (countOfMin);
    }
}

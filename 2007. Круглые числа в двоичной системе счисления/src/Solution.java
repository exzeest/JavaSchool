import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int countOfZeroes = 0;
        while (n % 2 == 0) {
            ++countOfZeroes;
            n /= 2;
        }
        System.out.println (countOfZeroes);
    }
}

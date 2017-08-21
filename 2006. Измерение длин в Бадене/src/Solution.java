import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int inchs = n % 3 > 1 ? n / 3 + 1: n / 3;
        System.out.print (inchs / 12 + " " + inchs % 12);
    }
}

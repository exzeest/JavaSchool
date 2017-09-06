import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        String result;
        if ( n < 7 ) result = "preschool child";
        else if ( n >= 7 && n < 18 ) result = "schoolchild " + ( n - 6 );
        else if ( n > 17 && n <= 22 ) result = "student " + ( n - 17 );
        else result = "specialist";
        System.out.println (result);
    }
}

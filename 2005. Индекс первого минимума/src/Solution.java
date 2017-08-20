import java.util.Scanner;

public class Solution {
    /*
    Заданы n целых чисел. Выведите индекс (позицию) первого из минимальных элементов последовательности.
    Элементы последовательности занумерованы от 1 слева направо.
    Входные данные
    В первой строке записано целое число n (1 ≤ n ≤ 10000).
    Вторая строка содержит последовательность целых чисел a1, a2,..., an (-10000 ≤ ai ≤ 10000).
    Выходные данные
    Выведите искомый индекс.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = scanner.nextInt();
        int indexOfMin = 1;
        for (int i = 2; i<=n; ++i) {
            int nextInt = scanner.nextInt();
            if (min > nextInt){
                min = nextInt;
                indexOfMin = i;
            }

        }
        System.out.println(indexOfMin);
    }
}

import java.util.Scanner;

public class Solution {
    /*
    Задана последовательность n чисел a1, a2,..., an.
    Для нее вычисляется "хитрая" сумма: s=+a1-a2-a3+a4+a5+a6-a7-a8-a9-a10+...,
    т.е. знаки плюс и минус чередуются блоками, длина i-го блока равна i.
    Выведите "хитрую" сумму заданной последовательности.
    Входные данные
    В первой строке задано целое число n (1 ≤ n ≤ 10000).
    Далее во второй строке задана последовательность a1, a2,..., an (1 ≤ ai ≤ 10000).
    Выходные данные
    Выведите "хитрую" сумму заданной последовательности.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int summ = 0;
        int countOfOperations = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % 2 == 0)
                for (int j = 1; j <= i && countOfOperations < n; ++j){
                    summ -= scanner.nextInt ();
                    ++countOfOperations;
                }

            else
                for (int j = 1; j <= i && countOfOperations < n; ++j){
                    summ += scanner.nextInt ();
                    ++countOfOperations;
                }
        }
        System.out.println (summ);
    }
}

package tasks;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int limit, start;
        if (n > m) {
            limit = n;
            start = m % 2 == 0 ? m + 1 : m;
        } else {
            limit = m;
            start = n % 2 == 0 ? n + 1 : n;
        }

        int sum = 0;
        for (int i = start; i <= limit; i += 2){
            sum += i;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}

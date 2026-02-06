
package tasks;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        int hours = input / 3600;
        int remaining = input % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}

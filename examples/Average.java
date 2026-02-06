package examples;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of numbers: "+ sum);
        sc.close();
    }
}

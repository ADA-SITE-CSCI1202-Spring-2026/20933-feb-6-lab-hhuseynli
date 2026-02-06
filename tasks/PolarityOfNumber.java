package tasks;
import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        input.close();

        if (number > 0){
            System.out.println("Number is positive");
        } else if (number < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is neither negative nor positive (0)");
        }
    }
}
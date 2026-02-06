package examples;
public class Calc {
    public static void main(String[] args) {
        // don't activate inline suggestions
        if (args.length != 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
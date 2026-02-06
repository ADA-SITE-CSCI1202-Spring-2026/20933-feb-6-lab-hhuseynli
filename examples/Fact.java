package examples;

public class Fact {
    public static void main(String[] args) {
        if (args.length != 1 || Integer.parseInt(args[0]) < 0) {
            System.out.println("Please provide a non-negative number as an argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }
}

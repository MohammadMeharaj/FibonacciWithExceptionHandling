import java.util.*;

public class FibonacciWithExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter the value of n for Fibonacci sequence: ");
            int n = s.nextInt();

            if (n < 0) {
                System.out.println("Input must be a non-negative integer.");
            }

            System.out.println("Fibonacci Sequence:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer.");
        } 
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
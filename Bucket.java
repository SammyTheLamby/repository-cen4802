/**
 * The Fibonacci class provides methods for calculating Fibonacci numbers.
 * Fibonacci numbers form a sequence where each number is the sum of the two preceding ones,
 * starting with 0 and 1.
 */
public class Bucket {
/**
     * @param n the position of the term to calculate
     * @return the nth term in the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
 /**
 * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}

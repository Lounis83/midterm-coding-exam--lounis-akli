package mathproblems;


public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n = 5;
        System.out.println("The Factorial of " + n + "! = " + factorial(n));
    }

    /**
     * This method calculate the factorial of any argument you pass on the main method
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        // base case: if n is 0
        if (n < 1) {
            return 1;
        } else { // use the recurrence relation
            return n * factorial(n - 1);
        }
    }
}


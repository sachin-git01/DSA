import java.util.*;

class Main {

    // 1. Even or Odd
    static void evenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // 2. Positive or Negative
    static void posNeg(int n) {
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    // 3. Sum till N
    static void sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("Sum = " + sum);
    }

    // 4. Greatest of 3 numbers
    static void greatest(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Greatest = " + max);
    }

    // 5. Leap Year
    static void leapYear(int year) {
        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    // 6. AP Series
    static void AP(int a, int d, int n) {
        for (int i = 0; i < n; i++)
            System.out.print((a + i * d) + " ");

        System.out.println();
    }

    // 7. GP Series
    static void GP(int a, int r, int n) {
        int term = a;

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term *= r;
        }

        System.out.println();
    }

    // 8. Sum of GP
    static void sumGP(int a, int r, int n) {
        int sum = 0;
        int term = a;

        for (int i = 0; i < n; i++) {
            sum += term;
            term *= r;
        }

        System.out.println("GP Sum = " + sum);
    }

    // 9. Factorial
    static void factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("Factorial = " + fact);
    }

    // 10. Power
    static void power(int a, int b) {
        int ans = 1;

        for (int i = 1; i <= b; i++)
            ans *= a;

        System.out.println("Power = " + ans);
    }

    public static void main(String[] args) {

        evenOdd(10);

        posNeg(-5);

        sumN(10);

        greatest(10, 25, 15);

        leapYear(2024);

        // AP: first term, common difference, number of terms
        AP(2, 3, 5);

        // GP: first term, common ratio, number of terms
        GP(2, 3, 5);

        sumGP(2, 3, 5);

        factorial(5);

        power(2, 5);
    }
}

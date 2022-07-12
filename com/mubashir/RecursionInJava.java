package com.mubashir;

public class RecursionInJava {
    // factorial(n) = n * n-1 * ....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) { // 1 to n
                product *= i;
            }
            return product;
        }

    }

    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n * 1);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("(/*|)");
            }
            System.out.println();
        }
    }

    static void pattenusingRecursion(int n) {
        if (n > 0) {
            pattenusingRecursion(n - 1);
            for (int j = 0; j < n; j++) {
                System.out.print("M");
            }
            System.out.println("");
        }
    }

    static int sumRect(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRect(n - 1);
        }
    }

    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int x = 9;
        System.out.println("thE value of facctorial n is : " + factorial(5));
        System.out.println("thE value of facctorial x is : " + factorial(x));
        System.out.println("thE value of facctorial x is : " +
                factorial_iterative(x));
        table(7);
        table(10);
        pattern1(7);
        System.out.println("THE sUM OF FIRST 9 NATURAL NUMBERS : " + sumRect(9));
        int result = fib(21);
        System.out.println(result);
        pattenusingRecursion(7);
    }
}

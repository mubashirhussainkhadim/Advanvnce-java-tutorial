package com.mubashir;

public class VarArgs {
    static int sum(int... arr) {

        // avilable as int [] arr;
        int result = 0;
        for (int a : arr) {

            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Wellcome to Varargs tutorials");
        System.out.println("the Sume of  9000000 and 87567 : " + sum(9000000, 87567));
        System.out.println("the Sum of 1,3,4,5,6,7,9 : " + sum(1, 2, 3, 4, 5, 6, 7, 9));
        int marks[] = { 1, 2, 4, 5, 6, 7, 8, 89, 9, 67 };
        System.out.println("The Sum of Marks : " + (sum(marks)));
    }
}

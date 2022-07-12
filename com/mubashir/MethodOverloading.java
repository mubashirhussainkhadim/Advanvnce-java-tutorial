package com.mubashir;

public class MethodOverloading {
    static void foo() {
        System.out.println("Goood Morning Bro");
    }

    static void foo(String name) {
        System.out.println("Good Moring" + name);
    }

    static void foo(String name, int date, String Month) {
        System.out.println("Good Moring Mubashir " + name + " today date is " + date + Month);
    }

    public static void main(String[] args) {
        // Method overloading
        foo();
        foo("Mubashir");
        foo("Mubashir", 18, "July");
    }
}

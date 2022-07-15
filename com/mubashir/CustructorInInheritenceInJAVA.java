package com.mubashir;

/**
 * Base1
 */
class Base1 {
    Base1() {
        System.out.println("I am A Constructor");
    }

    Base1(int a) {
        System.out.println("I am new Constructor\n" + a);
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

/**
 * derived1
 */
class derived1 extends Base1 {
    derived1(int a, int b) {
        super(a);
        System.out.println("I am DERIVIED CLASS CONSTRUCTOR" + b);
    }

    derived1() {
        System.out.println("I am DERIVIED CLASS CONSTRUCTOR");
    }

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

/**
 * CustructorInInheritenceInJAVA
 */
public class CustructorInInheritenceInJAVA {

    public static void main(String[] args) {
        // derived1 d = new derived1();
        // d.setX(8);
        // System.out.println(d.getX());
        derived1 d1 = new derived1(14, 9);
        // System.out.println(d1);
    }

}

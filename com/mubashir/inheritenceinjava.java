package com.mubashir;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base() {
        System.out.println("I am A constructor");
    }
}

class derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

/**
 * inheritenceinjava
 */
public class inheritenceinjava {

    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        derived d = new derived();
        d.setX(4);
        System.out.println(d.getX());
        // you cannot acces child class component from base class

    }
}
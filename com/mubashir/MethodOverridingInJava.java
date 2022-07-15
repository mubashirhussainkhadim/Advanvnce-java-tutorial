package com.mubashir;

/**
 * InnerMethodOverridingInJava
 */
class OverridingInJava {
    int a;

    public int Mubashir() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am Method 2 of class OverridingInJava ");
    }

}

/**
 * InnerMethodOverridingInJava_1
 */
class OverridingInJava_1 extends OverridingInJava {
    public void meth3() {
        System.out.println("I am method 3 of class OverridingInJava_1");
    }

    @Override
    public void meth2() {
        // TODO Auto-generated method stub

        System.out.println("I am method 2 of class OverridingInJava_1");
    }

}

/**
 * MethodOverridingInJava
 */
public class MethodOverridingInJava {
    public static void main(String[] args) {
        OverridingInJava overridingInJava = new OverridingInJava();
        overridingInJava.meth2();
        OverridingInJava_1 OverridingInJava_1 = new OverridingInJava_1();
        OverridingInJava_1.meth2();
    }
}
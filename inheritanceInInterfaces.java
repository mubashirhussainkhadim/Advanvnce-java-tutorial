package com.mubashir;

/**
 * SampleInterface
 */
interface SampleInterface {
    void meth1();

    void meth2();
}

/**
 * childSampleInterface extends SampleInterface
 */
interface childSampleInterface extends SampleInterface {
    void meth3();

    void meth4();
}

/**
 * MySampleClass implements childSampleInterface
 */
class MySampleClass implements childSampleInterface {
    @Override
    public void meth3() {
        // TODO Auto-generated method stub
        System.out.println("I AM METHOD three");
    }

    @Override
    public void meth4() {
        // TODO Auto-generated method stub
        System.out.println("i am Method Four");

    }

    @Override
    public void meth2() {
        // TODO Auto-generated method stub
        System.out.println("I am method TWO");
    }

    @Override
    public void meth1() {
        // TODO Auto-generated method stub
        System.out.println("I am One Method ");
    }
}

/**
 * inheritanceInInterfaces
 */
public interface inheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass myclass = new MySampleClass();
        myclass.meth1();
        myclass.meth2();
        myclass.meth3();
        myclass.meth4();

    }

}

// AbstractInJava
package com.mubashir;

/**
 * AbstractInJava
 */
abstract class Parent2 {
    public Parent2() {
        System.out.println("I am A constructor of Base 2");
    }
    public void SayHello() {
        System.out.println("Hello");
    }
    abstract public void greed();
}
class Child2 extends Parent2 {
    @Override
    public void greed() {
        // TODO Auto-generated method stub
        System.out.println("Good Morning");
    }
}
abstract class Child3 extends Parent2 {
    public void th() {
        System.out.println("I am good");
    }
}
public class AbstractInJava {

    
}

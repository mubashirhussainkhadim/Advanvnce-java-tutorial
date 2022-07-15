package com.mubashir;

/**
 * One
 */
class phone {
    public void greed() {
        System.out.println("Hello How are you !!!");
    }

    public void name() {
        System.out.println("Hello My name Nokia 3310");
    }
}

/**
 * Two extends One
 */
class SmartPhone extends phone {
    public void name() {
        System.out.println("MY Name is Iphone X");
    }

    public void Salam() {
        System.out.println("Hello Assalam - e - Alikum");
    }
}

/**
 * DynamicMethodDispatchInJAVA
 */
public class DynamicMethodDispatchInJAVA {
    public static void main(String[] args) {
        // phone obj = new phone();
        // SmartPhone smobj = new SmartPhone();
        // obj.name();
        phone obj = new SmartPhone();
        obj.greed();
        obj.name();
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> f5ccda994fe7e99a715fe3913be871f735a2e6f7

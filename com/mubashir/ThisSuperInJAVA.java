package com.mubashir;

/**
 * InnerThisSuperInJAVA
 */
class InnerThisSuperInJAVA {
    int a;

    public int getA() {
        return a;
    }

    InnerThisSuperInJAVA(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }

}

/**
 * ThisSuperInJAVA
 */
public class ThisSuperInJAVA {
    public static void main(String[] args) {
        InnerThisSuperInJAVA e = new InnerThisSuperInJAVA(5);
        System.out.println(e.getA());
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> f5ccda994fe7e99a715fe3913be871f735a2e6f7

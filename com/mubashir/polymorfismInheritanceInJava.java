package com.mubashir;

/**
 * Camera
 */
interface MyCamera2 {
    void takesnap();

    void recordVideo();

    default void Record4kVideo() {
        System.out.println("This is use for record video only");
    }
}

interface Wifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Call" + phoneNumber);
    }

    void pickCall(int phoneNumber) {
        System.out.println("Connecting...." + phoneNumber);
    }
    // void takesnap() {
    // System.out.println("Taking Snap");
    // }
}

class MySmartphone2 extends MyCellPhone2 implements Wifi2, MyCamera2 {
    public void takesnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("video is recoded");
    }

    public void callNumber(int phoneNumber) {
        System.out.println("Call" + phoneNumber);
    }

    public void pickCall(int phoneNumber) {
        System.out.println("Connecting...." + phoneNumber);
    }

    public String[] getNetworks() {
        System.out.println("Getting lis of Networks");
        String[] networkList = { "Harry", "Mubashit", "adnan", "Imran" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}

/**
 * polymorfismInheritanceInJava
 */

public class polymorfismInheritanceInJava {

    public static void main(String[] args) {
        // MySmartphone2 ms = new MySmartphone2();
        // String[] ar = ms.getNetworks();
        // for (String item : ar) {
        // System.out.println(item);
        // }
        // }
        MyCamera2 cam1 = new MySmartphone2();
        // cam1.getNetworks(); ---> not allowed
        cam1.Record4kVideo(); // ----> allowed
    }
}
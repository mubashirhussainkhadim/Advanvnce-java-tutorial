package com.mubashir;

/**
 * Camera
 */
interface MyCamera {
    void takesnap();

    void recordVideo();
    default void Record4kVideo (){
        System.out.println("");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
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

class MySmartphone extends MyCellPhone implements Wifi, MyCamera {
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
 * InnerinterfaceInJava
 */

public class interfaceInJava {

    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}

package com.mubashir;

class MyMainEmploye {
    private int id;
    private String name;

    public MyMainEmploye() {
        id = 0;
        name = "Mubashir hussain";
    }

    public MyMainEmploye(int myid, String myname) {
        id = myid;
        name = myname;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

/**
 * CustructorInJava
 */
public class CustructorInJava {
    public static void main(String[] args) {
        MyMainEmploye Mubashir = new MyMainEmploye();
        // Mubashir.setName("Mubashir Hussain Khadim");
        // Mubashir.setId(34);
        System.out.println(Mubashir.getName());
        System.out.println(Mubashir.getId());
    }

}
package com.mubashir;

class MyEmploye {
    private int id;
    private String name;

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

public class accessModifierInJava {
    public static void main(String[] args) {
        MyEmploye Mubashir = new MyEmploye();
        // Mubashir.id = 18;
        // Mubashir.name = "Blockchain Scientist";
        // trow error due to private acces modifier
        Mubashir.setName("Blockchain Eng");
        Mubashir.setId(12);
        System.out.println(Mubashir.getName());
        System.out.println(Mubashir.getId());
    }
}

package com.mubashir;

class Employee {
    String NIC;
    int id;
    String Proffesion;
    int sallary;

    public void printdetails() {
        System.out.println("My Id is " + id);
        System.out.println("My Proffesion IS " + Proffesion);
        System.out.println("and MY NIC is " + NIC);
        System.out.println("My Sallary is " + sallary);
    }
}

public class customClass {
    public static void main(String[] args) {
        System.out.println("This is Our Custom Class");
        Employee mubashir = new Employee();
        Employee Amina = new Employee();
        mubashir.NIC = "3520067786327";
        mubashir.Proffesion = "Blockchain Scientist";
        mubashir.id = 12;
        mubashir.sallary = 120000000;
        Amina.NIC = "35494985985";
        Amina.Proffesion = "Graphic Designer";
        Amina.id = 2;
        Amina.sallary = 232200;

        System.out.println("Employer Data");
        mubashir.printdetails();
        System.out.println("---------------------");
        Amina.printdetails();
    }

}
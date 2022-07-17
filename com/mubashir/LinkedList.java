package com.mubashir;
import java.util.LinkedList;

public class ListListst {
     public static void main(String[] args) {
    	 LinkedList<String> countries = new LinkedList<>();
    	 countries.add("Pakistan");
    	 countries.add("America");
    	 countries.add("Ireland");
    	 countries.add("Russia");
    	 countries.add("WEtnam");
    	 countries.add("China");
    	 countries.add("INdonasia");
    	 countries.add("Srilanka");
    	 countries.add("London");
    	 countries.add("Iran");
    	 new ListListst().printList(countries);
    	 countries.add(1 , "Canada");
    	 countries.add("Brazil");
    	 new ListListst().printList(countries);
         countries.set(7, "America");
    	 new ListListst().printList(countries);
         countries.remove(4);
    	 new ListListst().printList(countries);
 
    	 
    	 

     }
     void printList(LinkedList<String> list) {
    	 for(String elements:list) {
    		 System.out.println("Elements: " +elements);
    	 }
    	System.out.println("**********************");
     }
}

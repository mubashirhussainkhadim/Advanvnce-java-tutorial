package com.mubashir;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapsInJava {

	public static void main(String[] args) {
     Map<Integer,String> students = new HashMap<>();
     students.put(7, "Mubashir");
     students.put(6, "Ali");
     students.put(3, "Saboor");
     students.put(4, "Minahil");
     students.put(5, "Arooj");
     students.put(2, "Aleena");
     students.put(1, "Ehsan");
     
     
//     for (Map.Entry<Integer, String> entry: students.entrySet()) {
//    	 System.out.println("key: "+ entry.getKey() + " value: "+entry.getValue());
//     }
     
//     for (Integer key: students.keySet()) {
//    	 System.out.println("key: "+ key + " value: "+students.get(key));
//     }
//     
     Iterator<Entry<Integer , String>> entry = students.entrySet().iterator();
     System.out.println(students.get(7));
     
     while(entry.hasNext()) {
    	 Entry<Integer, String> temp = entry.next();
    	 System.out.println("key: "+temp.getKey() + "Value: " +temp.getValue());
     }
     
	}

}

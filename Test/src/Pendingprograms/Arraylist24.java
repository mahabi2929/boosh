package Pendingprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist24 {

	private static Object i1;

	public static void main(String[] args) {
ArrayList<String> Students = new ArrayList<String>();
        
        Students.add("Rose");
        Students.add("Pooja");
        Students.add( "Oviya");
        Students.add( "Binu");
        Students.add(0,"Watt");
        Students.add(5,"Baiju");
        Students.add("Punitha");
        Students.add("Gowtham");
        System.out.println(Students);
        Collections.sort(Students);
        System.out.println("Student in sorted form: "+Students);
        Iterator i = Students.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
           System.out.println(i.next());
          // options starts below
           int a;
		switch (a=3){
           case 1:
           Students.add("Naveen");
           System.out.println("option 1 : "+Students);
           break;
           case 2:
	       String element = Students.get(2); 
	       System.out.println("the element at index 2 is " +Students.get(2)); 
	       break;
           case 3:
        	   int size = Students.size();
			   for(int i1=0;i1<size;i1++)
	         System.out.println("retrieve element: "+Students.get(i1));
			   break;
           case 4:
        	   //retrieve all elements
        	   Iterator i1 = Students.iterator();
               System.out.println("The ArrayList elements are: "+Students);
               while (i1.hasNext())
                  System.out.println(i1.next());
                  break;
                  default:
                	  System.out.println("exist the application");
        
           }
			
		}

	}
}

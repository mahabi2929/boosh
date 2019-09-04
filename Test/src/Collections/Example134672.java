package Collections;
import java.util.ArrayList;
import java.util.List;

public class Example134672 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Colours = new ArrayList<String>();
        
        Colours.add("Red");
        Colours.add("Pink");
        Colours.add( "Orange");
        Colours.add( "Blue");
        Colours.add(0,"White");
        Colours.add(5,"Black");
        Colours.add("Purple");
        Colours.add("Green");
	        {
		        	System.out.println(Colours);
		        	String element = Colours.get(1);
		  		  System.out.println("First element: "+element);
		  		  element = Colours.get(3);
		  		  System.out.println("Third element: "+element);
		  		if (Colours.contains("Lavandor")) {
		  		    System.out.println("Found the element");
		  		    } else {
		  		    System.out.println("There is no such element");
		  		    }
		  		Colours.remove(2);
		  		Colours.remove(5);
                System.out.println("The modified list is : "+Colours);
                System.out.println("iteration");
               }
		        for(String element: Colours)
		        {
		        	
		        	System.out.println(element);
		        }
	
		    }
	}



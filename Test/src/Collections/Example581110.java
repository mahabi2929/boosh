package Collections;
import java.util.*;

public class Example581110 {

	public static void main(String[] args) {
		  ArrayList<String> Colours = new ArrayList<String>();
		  Colours.add("Red");
		  Colours.add("Green");
		  Colours.add("Orange");
		 Colours.add("White");
		  Colours.add("Black");
	        Colours.add("Purple");
		  System.out.println(Colours);
		  Colours.set(3,"Yellow");
		  System.out.println("updated list: "+Colours);
		  Collections.sort(Colours);
		  System.out.println("ascending order: "+Colours);
		  Collections.sort(Colours,Collections.reverseOrder());
		  System.out.println("descending order: " +Colours);
		  Collections.shuffle(Colours);
		  System.out.println("Suffled list: "+Colours);
		  Collections.swap(Colours, 2, 4);
		  System.out.println("Swaped array: "+Colours);
		  System.out.println("Converting Arrayto Arraylist");
	        String[] item = Colours.toArray(new String[Colours.size()]);  

		  
	        for(String s : item){  
	            System.out.println(s);  
	        }  
	      /*  System.out.println("Converting Array to ArrayList" );  
	        List<String>l2 = new ArrayList<String>();  
	        l2 =  Arrays.asList(item);  
	        System.out.println(l2);  
	    }  
		  
		 /* if(ArrayList.isEmpty())
		  {
			  System.out.println("Print the Array is Empty");
		  }
		  else
		  {
			  System.out.println("Print the Array is not Empty");
		  }*/
		  
	
	}
}

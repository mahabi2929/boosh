package Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
        System.out.println("original length: "+c1);
        c1.trimToSize();
        System.out.println("Trim size arraylist: "+c1);
       /* int index_position=0;
        String newvalue="Purple";
        for(int i=c1.length-1; i > index_position; i--){
            c1[i] = c1[i-1];
           }
           c1[index_position] = newvalue;
           System.out.println("New Array: "+Arrays.toString(c1));
  for(String element: c1)
  {
	  System.out.println(c1);
  }*/

	}

}

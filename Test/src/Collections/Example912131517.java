package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example912131517 {

	public static void main(String[] args) {
		List <String>num=new ArrayList<String>();
		num.add("1");
		num.add("2");
		num.add("3");
		List<String>num1=new ArrayList <String> ();
		num1.add("One");
		num1.add("Two");
		num1.add("Three");
		num1.add("Four");
		num1.add("Five");
		ArrayList<String>num2=new ArrayList<String>();
		num2.add("6");
		num2.add("7");
		num2.add("8");
		num2.add("9");
		System.out.println("Before copy: "+num1);
		Collections.copy(num1,num);
		System.out.println("After copy: "+num1);
		System.out.println("Before Compare: "+"\n"+num+"\n"+num1);
		System.out.println("After Compare: ");
		System.out.println(num.equals(num1));
		List<String>Sub_List=num1.subList(2,4);
		System.out.println("Sublist of num1 is: "+Sub_List);
		num.addAll(num1);
		System.out.println("adding two arraylist: "+num);
		System.out.println("Before clearing: "+num2);
	//	num2.clear();
	//	System.out.println("After clearing all: "+num2);
		//ArrayList<String>num3obj=new ArrayList<String>();
		//num3obj
		//ArrayList<String>num3Clone=(ArrayList<String>)
				num2.clone();
		System.out.println("The cloned arraylist is: "+num2);
		
		
	}

}

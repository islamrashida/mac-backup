package Wrappers;

import java.util.ArrayList;
import java.util.Iterator;

public class Autoboxing {

	public static void main(String[] args) {
		// how to use wrapper classes
		
		/* int a = 6;
		Integer convert = new Integer(a);
		System.out.println(convert);// this process calls wrapping/AutoBoxing
		
		int d = convert;
		System.out.println(d);//unwrapping/unBoxing
		
		
		boolean  b = true;
		
		Boolean convert1  = new Boolean(b);
		
		System.out.println(convert1);
		
		char ch = 121;
		
		Character newConvert = new Character (ch);
		
		System.out.println(newConvert);

	}*/
		
		ArrayList ob = new ArrayList(); //how to declare array list
		
	
	System.out.println(ob);
	System.out.println(ob.size());
	ob.add(1000);// AutoBoxing
	ob.add(true);
	ob.add(6.66666);
	//float value
	
	System.out.println(ob.get(0));
	System.out.println(ob.size());
	System.out.println(ob.get(2));
	for(int i = 0; i<ob.size(); i++) {
		System.out.println(ob.get(i));
	}
	
	for (Object u:ob){
		System.out.println(u);
	}
	Iterator itr = ob.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());

	}
	ArrayList<String> ra = new ArrayList<String>();
	ra.add("Karina");
	System.out.println(ra.get(0));


	
	}
}



package Arrays;

public class Methodsofpiit {

	public static void main(String[] args) {
		// call the static methods into static methods directly
		//u can't call non static methods into static methods
		// how to call non static into static methods
		//create the object of the class
		// you can call non static directly
		
		addition();
		//classname nameofobject = new constructor of the class// constructor is equal to class name
		Methodsofpiit ob = new Methodsofpiit();
		ob.subtraction();
		
		

	}
	
	//Static methods and non static methods
	public static void addition() {
		System.out.println("This is addition");
		
		
	}
	public void subtraction() {
		System.out.println("This is subtraction");
		//
		multiplication();
		addition();
	}
	public void multiplication() {
		System.out.println(("This is non static "));
	}

}

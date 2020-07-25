package GROopMethod;

public class Teacher {
	
	String name,gender;
	int phone;
	
	void setInformation(String n, String m,int ph) {
		name = n;
		gender= m;
		phone= ph;
		
	
	}
	
	
	void displayInformation (){
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("phone : "+phone);		
				
		
	}
	

}

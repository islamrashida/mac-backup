package Arrays;

public class codingofprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//runtime exception are those which is not caught during compilization
		
		foodStoreAshburn ob = new foodStoreAshburn();
		
		ob.addition();
		ob.division();
		ob.multiplication();
		ob.privateofmethods();
		int d=ob.getI();
		ob.setI(6000);
		
		System.out.println(d);
//		System.out.
		try {
		
		System.out.println("This is begining");
		int i=60;
		int r=i/0;
		System.out.println(r);
		
		}catch (Exception e) {
		System.err.println("There error displays");
		System.out.println(e.getMessage());
		e.printStackTrace();
		
		}
		System.out.println("This is end");
	}
}
		
		
		

	



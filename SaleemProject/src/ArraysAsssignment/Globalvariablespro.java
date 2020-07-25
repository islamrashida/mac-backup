package ArraysAsssignment;

public class Globalvariablespro {
	
	//Global variables are those which created outside of methods but inside the class
	
	int d = 60;
	int t = 80;
	int u;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Globalvariablespro saleem = new Globalvariablespro();
		saleem.addition();
        saleem.subtraction();
        saleem.multiplication();
        

	}
	//you can't use local variables outside of methods
	public void addition() {
		
		u = d+t;
		int r  = d-this.t;
		System.out.println(u);
		System.out.println(r);
	}
	
	public void subtraction() {
		u=d-t;
		System.out.println(u);
	}
		public void multiplication() {
			u = d*t;
			System.out.println(u);
		}
		
		
		
		
	}
	



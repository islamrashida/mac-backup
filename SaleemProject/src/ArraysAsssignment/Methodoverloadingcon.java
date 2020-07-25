package ArraysAsssignment;

public class Methodoverloadingcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloadingcon ov=new Methodoverloadingcon();
		int a = 10;
		int r = 50;
		int t = 70;
		ov.addition(a, r, t);

	}
	public void addition() {
		System.out.println("This is addition without argumnet");
	}
	public void addition(int a, int d) {
		System.out.println("This is addition without argument");

		}
	public void addition (int a, int r, int t) {
		System.out.println("This is addition without argument");
	}
	
	
	
public void addition(float a, String d) {
	System.out.println("This is addition without argument");
}
}

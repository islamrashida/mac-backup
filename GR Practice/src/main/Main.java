package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Start");
		sayHi();
		
		int addition = getSum(100, 50);
		System.out.println("Result: " + addition);
		

	}
	
	static int getSum(int x, int y) {
		int sum = x + y;
		int sub = x - y;
		
		return sub;
		
	}
	
	static void sayHi() {
		System.out.println("Hi");
	}

}

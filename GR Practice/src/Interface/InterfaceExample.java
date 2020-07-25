
package Interface;


interface WaterBottleInterface {
	
	String color = "Blue";
	void fillup();
	void pourOut();
	
	
	
}

public class InterfaceExample implements WaterBottleInterface{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(color);
		InterfaceExample ex = new InterfaceExample();
		ex.fillup();
		ex.pourOut();

	}

	

	

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		System.out.println("This is pourout");
	}

	@Override
	public void fillup() {
		// TODO Auto-generated method stub
		System.out.println("This is fillup");
		
	}

}


class Car {
	
	String brand;
	
	public Car() {
		brand = "Ford";
		
		}
	
	public String getBrand() {
		return brand;
		
	}
	//void run() {
		//System.out.println("Car is running....");
	




	
	public static void main(String[] args) {
		
		Car ford = new Car();
		String brand = ford.getBrand();
		System.out.println(brand);
		
	}
}

package Arrays;

public class Methodsdifferentfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//different ways to create methods
		
		Methodsdifferentfor obj= new Methodsdifferentfor();
	
		int profitbefortax=obj.calculationofcompany(100000, 60000,"Jan");
		int profitaftertax= profitbefortax-6000;
		System.out.println(profitaftertax);
		
		
		
		
		obj.calculationofcompany(60000,  26000, "Feb");
		obj.calculationofcompany(300000,  6000,"March");

	}
	
	//calculate the profit of the company
	//Method without arguments
	// Methods with arguments
	
	public int calculationofcompany(int income, int expense, String Month) {
		
		
		int profit=income-expense;
		System.out.println("Profit of month "+Month+"="+profit);
		return profit;
	}
	

}

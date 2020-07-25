package Abstruction;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDLCBank hb = new HDLCBank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HDLCBank();
		b.loan();
		b.credit();
		b.debit();
		

	}

}

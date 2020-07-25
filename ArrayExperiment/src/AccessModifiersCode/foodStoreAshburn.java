package AccessModifiersCode;

public class foodStoreAshburn {
	private int i = 60;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		foodStoreAshburn ob = new foodStoreAshburn();
		ob.addition();
		ob.division();
		ob.multiplication();
		ob.privateofmethods();
		int d=ob.getI();
		ob.setI(6000);
		
//		System.out.println((ob.getI();
//		System.out.println((d);
		
	}	
	
		
		public void addition() {
			System.out.println("This is access Modifiers");
			
		}
		private void subtraction() {
			System.out.println("This is data hiding");
			
			
			
			
			
			
		}
		protected void division() {
			System.out.println("This is protected");
		}
		void multiplication() {
			
		}
		public void privateofmethods() {
			subtraction();
			//Create public method
			//call the private method into public method
			//then call the public method into another class
			
		}
		

	}



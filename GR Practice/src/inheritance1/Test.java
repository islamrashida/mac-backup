package inheritance1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher t1 = new Teacher();

t1.name = "Alak Kanti";
t1.age = 30;
t1.qualification = "Msc in CSE";

t1.displayInformation2();

Teacher t2 = new Teacher();

t2.name = "Rashu Bibi";
t2.age  = 50;
t2.qualification = "MSc in Geography";

t2.displayInformation2();

Teacher t3 = new Teacher();
t3.name = "Onamika";
t3.age = 35;
t3.qualification = "PHD in math";

t3.displayInformation(3)




	}

}

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] life = {98,45,234,10,20,30,40,50,60,70,80,90,100};
		
		String[] life2 = {"Ganja", "Java", "Python", "PHP", "C#", "C Programming","C++"};

	System.out.println("Original numaric array :"+ Arrays.toString(life));
	
	Arrays.sort(life);
	System.out.println("Original numaric sorted array :"+ Arrays.toString(life));

System.out.println("Original Stringa :"+ Arrays.toString(life2));
	
	Arrays.sort(life2);
	System.out.println("Original sorted Strings :"+ Arrays.toString(life2));


}
}
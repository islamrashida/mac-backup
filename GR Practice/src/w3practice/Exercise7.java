package w3practice;

import java.util.Scanner;

//7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
public class Exercise7 {
	public static void main(String[] args) {
		Scanner flower = new Scanner(System.in);
		System.out.println("input a number");
		int x = flower.nextInt();
		for (int i = 1; i <= 100; i++) {
			System.out.println(x+"x"+i+"="+x*i);
			
		}
		
	}

}

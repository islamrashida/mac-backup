package w3practice;

import java.util.Scanner;

//6. Write a Java program to print the sum (addition), multiply, subtract, 
//divide and remainder of two numbers. Go to the editor
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

public class Exercise6 {

	public static void main(String[] args) {
		Scanner amarkopal = new Scanner(System.in);
		
	
		System.out.print("Input first number:");
		int life = amarkopal.nextInt();
		
		System.out.println("input second number");
		int tears = amarkopal.nextInt();
		
int sum = (life + tears);
int mul = (life * tears);
int division = (life / tears);
int sub = (life -tears);
int mod = (life % tears);


System.out.println("Expected output:" + sum);
System.out.println("Expected output:" + division);
System.out.println("Expected output:" + sub);
System.out.println("Expected output:" + mul);
System.out.println("Expected output:" + mod);
	}

}

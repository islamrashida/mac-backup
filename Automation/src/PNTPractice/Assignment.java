package PNTPractice;

public class Assignment {
	
	public static void main(String[] args) {
		
		int Computer = 90;
		int Linux = 80;
		int Science = 60;
		int Grade = 100;
		
		int totalMarks = Computer + Linux + Science;
		int totalSubject = 3;
		
		int obtainedMarks = totalMarks*100/300;
		
		System.out.println("Total Mark is " + totalMarks);
		System.out.println("The Percentage of Obtained Marks " + obtainedMarks);
		
		if(Grade >=90 && Grade<= 100) {
			System.out.println("Grade is A");
			
		} else if (Grade>=80 && Grade<= 90) {
			
			System.out.println("Grade is B");
			
		} else if (Grade >=70 && Grade<=80) {
			System.out.println("Grade is C "); 
			} else {
				System.out.println("Grade is Fail");
			}
			
			
		}
				
		
		
		
	}
	


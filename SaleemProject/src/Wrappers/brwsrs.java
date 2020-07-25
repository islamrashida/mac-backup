package Wrappers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class brwsrs {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		brwsrs crt = new brwsrs();
		crt.Parameters();
		

	}
	
	public void Parameters() throws IOException {
		
	
		
		Properties writing = new Properties();
		
		FileInputStream obj = new FileInputStream("//Users//rashidaislam//eclipse-workspace//SaleemProject//src//Automation.properties");
		
		writing.load(obj);
		
		System.out.println(writing.getProperty("Name"));
		System.out.println(writing.getProperty("Job"));
		System.out.println(writing.getProperty("City"));
		
		
		}
	}

	
		
		
	



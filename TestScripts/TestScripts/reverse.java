package Com.MyFirstJavaApp.TestScripts;
import java.util.Scanner;

public class reverse {

	
		public static void main(String[] args) {
	        
	        Scanner obj = new Scanner(System.in);
	        
	        
	        System.out.print("Enter a number: ");
	        int number = obj.nextInt();
	        
	        int reversedNumber = 0; 
	        
	        while (number != 0) {
	            int digit = number % 10; 
	            reversedNumber = reversedNumber * 10 + digit; 
	            number = number / 10;
	        }
	        
	      
	        System.out.println("Output = " + reversedNumber);
	        
	       
	        obj.close();
	    }
	}

	

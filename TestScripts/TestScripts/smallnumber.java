package Com.MyFirstJavaApp.TestScripts;
import java.util.Scanner;
public class smallnumber {

	public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

       
        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = obj.nextInt();

        
        int smallest = Math.min(num1, Math.min(num2, num3));

        
        System.out.println("The smallest number is: " + smallest);

       
        obj.close();
    }
}
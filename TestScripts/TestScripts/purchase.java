package Com.MyFirstJavaApp.TestScripts;
import java.util.Scanner;

public class purchase {

	public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Enter the purchase amount: ");
        double amount = obj.nextDouble();
        double discount = 0;

       
        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10;  
        } else if (amount > 1000) {
            discount = amount * 0.20;  
        }

      
        double finalAmount = amount - discount;

        
        System.out.println("Discount applied: $" + discount);
        System.out.println("Final payable amount: $" + finalAmount);

       
        obj.close();
    }
}

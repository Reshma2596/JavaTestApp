package Com.MyFirstJavaApp.TestScripts;
import java.util.Scanner; 
public class negative {

	public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = obj.nextInt();
        
        
        if (number > 0) {
            System.out.println("Output = Positive");
        } else if (number < 0) {
            System.out.println("Output = Negative");
        } else {
            System.out.println("Output = Zero");
        }

        
        obj.close();
    }
}
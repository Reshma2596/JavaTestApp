package Com.MyFirstJavaApp.TestScripts;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int n = obj.nextInt();  
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print((n - j + 1) + " "); 
                } else {
                    System.out.print(n + " "); 
                }
            }
            System.out.println(); 
        }

        obj.close();
    }
}
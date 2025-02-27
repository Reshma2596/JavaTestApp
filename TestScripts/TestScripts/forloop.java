package Com.MyFirstJavaApp.TestScripts;
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = obj.nextInt();

        System.out.print("Enter the ending number: ");
        int end = obj.nextInt();

        // Using For Loop
        System.out.println("Numbers using For Loop:");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); 

        // Using While Loop
        System.out.println("Numbers using While Loop:");
        int i = start;
        while (i <= end) {
            System.out.print(i + " ");
            i++;
        }

        obj.close(); 
    }
}

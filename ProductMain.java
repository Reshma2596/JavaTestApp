package oops;
import java.util.Scanner;


class Product {
 int pid;
 double price;
 int quantity;

 
 public Product(int pid, double price, int quantity) {
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
 }
}
public class ProductMain {

	 
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity; 
        }
        return total;
    }

   
    public static int findHighestPriceProduct(Product[] products) {
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (Product p : products) {
            if (p.price > maxPrice) {
                maxPrice = p.price;
                maxPid = p.pid;
            }
        }
        return maxPid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + " (pid, price, quantity): ");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        
        int highestPricePid = findHighestPriceProduct(products);
        System.out.println("Product with highest price has PID: " + highestPricePid);

        
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}
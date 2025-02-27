package oops;
import java.util.Scanner;


class Account {
 private double balance;


 public Account() {
     this.balance = 0.0; 
 }

 
 public Account(double balance) {
     this.balance = balance;
 }

 
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Amount deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }


 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Amount withdrawn successfully.");
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance.");
     }
 }


 public void displayBalance() {
     System.out.println("Current Balance: " + balance);
 }
}


public class AccountMain {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     System.out.print("Enter initial balance: ");
     double initialBalance = scanner.nextDouble();
     Account account = new Account(initialBalance);

     
     System.out.print("Enter amount to deposit: ");
     double depositAmount = scanner.nextDouble();
     account.deposit(depositAmount);


     System.out.print("Enter amount to withdraw: ");
     double withdrawAmount = scanner.nextDouble();
     account.withdraw(withdrawAmount);

   
     account.displayBalance();

     scanner.close();
 }
}
package com.taxsystem;

import java.util.Scanner;

// Main class for user input and display
public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee Input
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, salary);
        System.out.println("\n--- Employee Details ---");
        employee.displayEmployee();

        // Product Input
        System.out.print("\nEnter Product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(productId, productName, price, quantity);
        System.out.println("\n--- Product Details ---");
        product.displayProduct();

        scanner.close();
    }
}

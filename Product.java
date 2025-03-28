package com.taxsystem;


class Product implements Taxable {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price * salesTax; 
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price per Unit: $" + price);
        System.out.println("Sales Tax per Unit: $" + calcTax());
    }
}

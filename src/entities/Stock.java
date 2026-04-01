package entities;

import java.util.Scanner;

import entities.Product;

public class Stock {
    private Product product;
    private Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Enter product data:");

        this.sc.nextLine();

        System.out.print("Name: ");
        String productName = this.sc.nextLine();

        System.out.print("Price: ");
        double productPrice = this.sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int productQuantity = this.sc.nextInt();

        this.product = new Product(productName, productPrice, productQuantity);

    }

    public void addProductQuantity() {
        System.out.print("Enter the amount to be added: ");
        int newQuantity = this.sc.nextInt();

        if (newQuantity < 1) {
            System.out.println("Invalid value");
            return;
        }

        this.product.quantity += newQuantity;
    }

    public void removeProductQuantity() {
        System.out.print("Enter the amount to be removed: ");
        int newQuantity = this.sc.nextInt();

        if (newQuantity > this.product.quantity) {
            System.out.println("Invalid value");
            return;
        }

        this.product.quantity -= newQuantity;
    }

    public void listProduct() {
        if (this.product == null) {
            System.out.println("Product not registered.");
            return;
        }

        System.out.println("Name: " + this.product.name);
        System.out.println("Quantity: " + this.product.quantity);
        System.out.println("Price: " + this.product.price);

    }
}
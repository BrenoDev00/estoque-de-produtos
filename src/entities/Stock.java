package entities;

import java.util.Scanner;

public class Stock {
    private Product product;
    private final static Scanner SC = new Scanner(System.in);

    private boolean isProductNotRegistered() {
        if (this.product == null) {
            System.out.println("Product not registered.");
            return true;
        }

        return false;
    }

    public void addProduct() {
        System.out.println("Enter product data:");

        SC.nextLine();

        System.out.print("Name: ");
        String productName = SC.nextLine();

        System.out.print("Price: ");
        double productPrice = SC.nextDouble();

        System.out.print("Quantity in stock: ");
        int productQuantity = SC.nextInt();

        this.product = new Product(productName, productPrice, productQuantity);

    }

    public void addProductQuantity() {
        if (this.isProductNotRegistered()) return;

        System.out.print("Enter the amount to be added: ");
        int newQuantity = SC.nextInt();

        this.product.addQuantity(newQuantity);
    }

    public void removeProductQuantity() {
        if (this.isProductNotRegistered()) return;

        System.out.print("Enter the amount to be removed: ");
        int newQuantity = SC.nextInt();

        this.product.removeQuantity(newQuantity);
    }

    public void listProduct() {
        if (this.isProductNotRegistered()) return;

        System.out.println("Name: " + this.product.getName());
        System.out.println("Quantity: " + this.product.getQuantity());
        System.out.println("Price: " + this.product.getPrice());

    }
}
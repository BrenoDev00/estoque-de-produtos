package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void addQuantity(int newQuantity) {
        if (newQuantity < 1) {
            System.out.println("Invalid value");
            return;
        }

        this.quantity += newQuantity;
    }

    public void removeQuantity(int newQuantity) {
        if (newQuantity > this.quantity || newQuantity < 1) {
            System.out.println("Invalid value");
            return;
        }

        this.quantity -= newQuantity;
    }
}
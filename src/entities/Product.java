package entities;

import interfaces.IProduct;

public class Product implements IProduct {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void addQuantity(int quantityToAdd) {
        if (quantityToAdd < 1) {
            System.out.println("Invalid value");
            return;
        }

        this.quantity += quantityToAdd;
    }

    public void removeQuantity(int quantityToRemove) {
        if (quantityToRemove > this.quantity || quantityToRemove < 1) {
            System.out.println("Invalid value");
            return;
        }

        this.quantity -= quantityToRemove;
    }
}
import entities.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var stock = new Stock();
        String selectedOption;

        do {
            System.out.println("Type 'exit' if you want to quit");
            System.out.println("Select an option from the menu: ");
            System.out.println("1 - Add product");
            System.out.println("2 - Add new quantity of product");
            System.out.println("3 - Remove product quantity");
            System.out.println("4 - List product");

            selectedOption = sc.nextLine();
            handleSelectedOption(selectedOption, stock);
        } while (!selectedOption.equals("exit"));

        sc.close();

    }

    public static void handleSelectedOption(String selectedOption, Stock stock) {

        switch (selectedOption) {
            case "1":
                stock.addProduct();
                break;
            case "2":
                stock.addProductQuantity();
                break;
            case "3":
                stock.removeProductQuantity();
                break;
            case "4":
                stock.listProduct();
                break;
            case "exit":
                System.out.println("Program ended.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}

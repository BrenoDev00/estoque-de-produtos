package interfaces;

public interface IProduct {
    String getName();

    Double getPrice();

    Integer getQuantity();

    void addQuantity(int quantityToAdd);

    void removeQuantity(int quantityToRemove);
}

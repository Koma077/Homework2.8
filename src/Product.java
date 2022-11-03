import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final int count;

    public Product(int count, String name, int price) {
        if (name != null && name.isBlank() && price > 0 && count > 0) {
            this.name = name;
            this.price = price;
            this.count = count;
            ProductList.addProductList(this);
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + price;

    }
}

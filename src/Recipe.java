import java.math.BigDecimal;
import java.util.*;

public class Recipe {
    private final String nameOfRecipe;
    private int totalCost;
    private final Map<Product, Integer> products = new HashMap<>();

    public Recipe(String nameOfProducts, int totalCost) {
        this.nameOfRecipe = nameOfProducts;
        this.totalCost = totalCost;
    }

    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
        totalCost = totalCost + product.getPrice() * quantity;
    }

    public int costRecipe() {
        int sum = 0;
        for(Product key : products.keySet()){
            sum += products.get(key) * key.getPrice();
    }
        return sum;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameOfRecipe, recipe.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }

    @Override
    public String toString() {
        return  nameOfRecipe;

    }
}

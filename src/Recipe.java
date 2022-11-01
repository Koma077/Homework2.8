import java.util.*;

public class Recipe {
     private final String nameOfRecipe;
     private int totalCost;
     private final Set<Product> products =  new HashSet<>();

    public Recipe(String nameOfProducts, int totalCost) {
        this.nameOfRecipe = nameOfProducts;
        this.totalCost = totalCost;
    }
    public void addProduct(Product product, int quantity) {
        if (products.contains(product)) {
            throw new RuntimeException("Продукт уже добавлен");
        }
        totalCost = (int) (totalCost + product.getPrice() * quantity);
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

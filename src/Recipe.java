import java.util.*;

public class Recipe {
     private final String nameOfRecipe;
     private int totalCost;
     private final Map<Product, Integer> products =  new HashMap<>();

    public Recipe(String nameOfProducts, int totalCost) {
        this.nameOfRecipe = nameOfProducts;
        this.totalCost = totalCost;
    }
    public void addProduct(Product product, int quantity){
        products.put(product, quantity);
        totalCost = (int) (totalCost + product.getPrice() * quantity);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public int getTotalCost() {
        return totalCost;
    }

//    public Set<Product> getProducts() {
//        return products;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCost == recipe.totalCost && Objects.equals(nameOfRecipe, recipe.nameOfRecipe) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, totalCost, products);
    }

    @Override
    public String toString() {
        return  nameOfRecipe;

    }
}

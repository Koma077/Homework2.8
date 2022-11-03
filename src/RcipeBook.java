import java.util.HashSet;
import java.util.Set;

public class RcipeBook {
    private static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe recipe) {
        for (var recipeInCollection : recipes) {
            if (recipeInCollection.equals(recipe)) {
                throw new RuntimeException("Такой рецепт уже есть ");
            }
            recipes.add(recipe);
        }
    }
}

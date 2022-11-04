import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RcipeBook {
    private static Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Recipe newRecipe) {
        if (!recipes.contains(newRecipe)) {
            recipes.add(newRecipe);
        } else {
            throw new RuntimeException("Такой рецепт уже есть ");
        }
    }
}

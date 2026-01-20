import java.util.ArrayList;

public class RecipesBook {
    private ArrayList<Recipe> recipeList;

    public RecipesBook () {
        this.recipeList = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public String getRecipesByName(String name) {
        String toPrint = "Recipes:\n";
        for (Recipe recipe: recipeList) {
            if (recipe.getName().contains(name)) {
                toPrint += recipe;
            }
        }

        return toPrint;
    }

    public String getRecipesByCookingTime(int maxCookingTime) {
        String toPrint = "Recipes:\n";
        for (Recipe recipe: recipeList) {
            if (recipe.getCookingDuration() <= maxCookingTime) {
                toPrint += recipe;
            }
        }

        return toPrint;
    }

    public String getRecipesByIngredient(String searchIngredient) {
        String toPrint = "Recipes:\n";
        for (Recipe recipe: recipeList) {
            for (String ingredient: recipe.getIngredients()) {
                if (ingredient.equals(searchIngredient)) {
                    toPrint += recipe;
                    break;
                }
            }
        }

        return toPrint;
    }

    public String toString() {
        String toPrint = "Recipes:\n";
        for (Recipe recipe: recipeList) {
            toPrint += recipe;
        }

        return toPrint;
    }
}

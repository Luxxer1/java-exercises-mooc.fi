import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingDuration;
    private ArrayList<String> ingredients;

    public Recipe(String name, Integer cookingDuration, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingDuration = cookingDuration;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingDuration() {
        return this.cookingDuration;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingDuration + "\n";
    }
}

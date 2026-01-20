
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        try (Scanner file = new Scanner(Paths.get(scanner.nextLine()))) {
            RecipesBook recipes = new RecipesBook();
            createRecipesFromFile(file, recipes);

            System.out.println("Commands:\n" +
                    "list - lists the recipes\n" +
                    "stop - stops the program\n" +
                    "find name - searches recipes by name" +
                    "find cooking time - searches recipes by cooking time" +
                    "find ingredient - searches recipes by ingredient");

            Boolean commandLoop = true;
            while (commandLoop) {
                System.out.println("Enter command: ");
                String command = scanner.nextLine();

                switch (command) {
                    case "list":
                        System.out.println(recipes);
                        break;

                    case "find name":
                        System.out.println("Searched word: ");
                        System.out.print(recipes.getRecipesByName(scanner.nextLine()));
                        break;

                    case "find cooking time":
                        System.out.println("Max cooking time: ");
                        System.out.println(recipes.getRecipesByCookingTime(Integer.valueOf(scanner.nextLine())));
                        break;

                    case "find ingredient":
                        System.out.println("Ingredient: ");
                        System.out.println(recipes.getRecipesByIngredient(scanner.nextLine()));
                        break;

                    case "stop":
                        commandLoop = false;
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void createRecipesFromFile(Scanner file, RecipesBook recipes) {
        String name = "";
        int cookingDuration = 0;
        ArrayList<String> ingredients = new ArrayList<>();

        while (file.hasNextLine()) {
            String row = file.nextLine();

            if (row.isEmpty()) {
               recipes.add(new Recipe(name, cookingDuration, ingredients));

                name = "";
                cookingDuration = 0;
                ingredients = new ArrayList<>();

                continue;
            }

            if (name.isEmpty()) {
                name = row;
                continue;
            }

            if (cookingDuration == 0) {
                cookingDuration = Integer.parseInt(row);
                continue;
            }

            ingredients.add(row);
        }

        if (!name.isEmpty()) {
            recipes.add(new Recipe(name, cookingDuration, ingredients));
        }
    }

}

import recipesBook.Recipe;
import recipesBook.RecipesBook;
import shoppingList.Good;
import shoppingList.Product;
import shoppingList.ShoppingList;

public class Solution {
    public static void main(String[] args) {
        var shoppingList = new ShoppingList();

        shoppingList.add(Good.APPLE, 1, 17.50);
        shoppingList.add(Good.BANANA, 1.5, 39.90);
        shoppingList.add(Good.WATERMELON, 4, 12);

        shoppingList.markAsPurchased(Good.APPLE);
        shoppingList.show();

        System.out.println();
        shoppingList.remove(Good.APPLE);
        shoppingList.show();


        var recipesBook = new RecipesBook();

        var recipe = new Recipe("first recipe");
        recipe.addProduct(new Product(Good.APPLE, 1, 15.00), 2);
        recipe.addProduct(new Product(Good.BANANA, 1, 19.00), 1);
        recipesBook.addRecipe(recipe);
    }
}

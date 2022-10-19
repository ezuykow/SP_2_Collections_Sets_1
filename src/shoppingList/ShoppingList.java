package shoppingList;

import java.util.HashSet;
import java.util.Set;

public class ShoppingList {

    private Set<Product> set;

    public ShoppingList() {
        set = new HashSet<>();
    }

    public void add(Good good, double weight, double price) {
        final Product product = new Product(good, weight, price);
        if (set.contains(product)) {
            throw new IllegalArgumentException("Product is already exists!");
        }
        set.add(product);
    }

    public void markAsPurchased(Good good) {
        set.stream().filter(p -> p.getGood() == good).findAny().ifPresent(p -> p.setPurchased(true));
    }

    public void remove(Good good) {
        final Product target;
        target = set.stream().filter(p -> p.getGood() == good).findAny().orElse(null);
        set.remove(target);
    }

    public void show() {
        set.forEach(p -> {
            System.out.printf("%s, %.2f kilograms, %.2f rubbles, purchased - %b\n",
                    p.getGood().getName(),
                    p.getWeight(),
                    p.getPrice(),
                    p.isPurchased());
        });
    }
}

import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("fruits Names: ");
        for (String names : fruits) {
            System.out.println(names);
        }

        fruits.add("Pineapple");
        System.out.println("fruits Names(After Add Pineapple): ");
        for (String names : fruits) {
            System.out.println(names);
        }
        fruits.add("Apple");
        System.out.println("fruits Names(After Add Apple): ");
        for (String names : fruits) {
            System.out.println(names);
        }

        boolean exists = fruits.contains("Mango");
        System.out.println("Does Mango exist? " + exists);

        boolean exists1 = fruits.contains("Watermelon ");
        System.out.println("Does Watermelon  exist? " + exists1);

        fruits.remove("Orange");
        System.out.println("fruits Names(After removing Orange): ");
        for (String names : fruits) {
            System.out.println(names);
        }

        System.out.println("Total number of fruits: " + fruits.size());

        fruits.add("Strawberry");
        System.out.println("New Total number of fruits: " + fruits.size());
        for (String names : fruits) {
            System.out.println(names);
        }

        fruits.clear();
        System.out.println("fruits Names(After removing all fruits): ");
        for (String names : fruits) {
            System.out.println(names);
        }
        System.out.println("Total number of fruits: " + fruits.size());
    }
}

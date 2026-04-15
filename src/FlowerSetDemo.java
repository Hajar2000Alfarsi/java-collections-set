import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {
    public static void main(String[] args) {
        Set<String> flowers = new HashSet<>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Sunflower");
        flowers.add("Jasmine");

        System.out.println("flowers Names: ");
        for (String names : flowers) {
            System.out.println(names);
        }

        flowers.add("Orchid");
        System.out.println("flowers Names(After Add Orchid): ");
        for (String names : flowers) {
            System.out.println(names);
        }
        flowers.add("Rose");
        System.out.println("flowers Names(After Add Rose): ");
        for (String names : flowers) {
            System.out.println(names);
        }

        boolean exists = flowers.contains("Tulip");
        System.out.println("Does Tulip exist? " + exists);

        boolean exists1 = flowers.contains("Lotus ");
        System.out.println("Does Lotus  exist? " + exists1);

        flowers.remove("Sunflower");
        System.out.println("flowers Names(After removing Sunflower): ");
        for (String names : flowers) {
            System.out.println(names);
        }

        System.out.println("Total number of flowers: " + flowers.size());

        flowers.add("Daisy");
        System.out.println("New Total number of flowers: " + flowers.size());
        for (String names : flowers) {
            System.out.println(names);
        }

        flowers.clear();
        System.out.println("flowers Names(After removing all flowers): ");
        for (String names : flowers) {
            System.out.println(names);
        }
        System.out.println("Total number of flowers: " + flowers.size());
    }
}

import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        System.out.println("animals Names: ");
        for (String names : animals) {
            System.out.println(names);
        }

        animals.add("Panda");
        System.out.println("animals Names(After Add Panda): ");
        for (String names : animals) {
            System.out.println(names);
        }
        animals.add("Lion");
        System.out.println("animals Names(After Add Lion): ");
        for (String names : animals) {
            System.out.println(names);
        }

        boolean exists = animals.contains("Dog");
        System.out.println("Does Dog exist? " + exists);

        boolean exists1 = animals.contains("Zebra");
        System.out.println("Does Zebra exist? " + exists1);

        animals.remove("Zebra");
        System.out.println("country Names(After removing Zebra): ");
        for (String names : animals) {
            System.out.println(names);
        }

        System.out.println("Total number of country: " + animals.size());

        animals.add("Kangaroo");
        System.out.println("New Total number of animals: " + animals.size());
        for (String names : animals) {
            System.out.println(names);
        }

        animals.clear();
        System.out.println("animals Names(After removing all animals): ");
        for (String names : animals) {
            System.out.println(names);
        }
        System.out.println("Total number of country: " + animals.size());
    }
}

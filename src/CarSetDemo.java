import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Nissan");

        System.out.println("cars Names: ");
        for (String names : cars) {
            System.out.println(names);
        }

        cars.add("Hyundai");
        System.out.println("cars Names(After Add Hyundai): ");
        for (String names : cars) {
            System.out.println(names);
        }
        cars.add("Toyota");
        System.out.println("cars Names(After Add Toyota): ");
        for (String names : cars) {
            System.out.println(names);
        }

        boolean exists = cars.contains("BMW");
        System.out.println("Does BMW exist? " + exists);

        boolean exists1 = cars.contains("Tesla");
        System.out.println("Does Tesla exist? " + exists1);

        cars.remove("Audi");
        System.out.println("cars Names(After removing Audi): ");
        for (String names : cars) {
            System.out.println(names);
        }

        cars.remove("Honda");
        System.out.println("cars Names(After removing Honda): ");
        for (String names : cars) {
            System.out.println(names);
        }
        System.out.println("Total number of cars: " + cars.size());

        cars.add("Kia");
        System.out.println("New Total number of cars: " + cars.size());
        for (String names : cars) {
            System.out.println(names);
        }

        cars.clear();
        System.out.println("cars Names(After removing all cars): ");
        for (String names : cars) {
            System.out.println(names);
        }
        System.out.println("Total number of cars: " + cars.size());
    }
}

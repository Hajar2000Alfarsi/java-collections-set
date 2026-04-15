import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {
        public static void main(String[] args) {
            Set<String> country = new HashSet<>();
            country.add("Oman");
            country.add("UAE");
            country.add("Saudi Arabia");
            country.add("Qatar");
            country.add("Bahrain");

            System.out.println("country Names: ");
            for (String names : country) {
                System.out.println(names);
            }

            country.add("Bahrain");
            System.out.println("country Names(After Add Bahrain): ");
            for (String names : country) {
                System.out.println(names);
            }
            country.add("Kuwait");
            System.out.println("country Names(After Add Kuwait): ");
            for (String names : country) {
                System.out.println(names);
            }

            boolean exists = country.contains("Kuwait");
            System.out.println("Does Kuwait exist? " + exists);

            boolean exists1 = country.contains("Qatar");
            System.out.println("Does Qatar exist? " + exists1);

            country.remove("UAE");
            System.out.println("country Names(After removing UAE): ");
            for (String names : country) {
                System.out.println(names);
            }

            country.remove("Qatar");
            System.out.println("country Names(After removing Qatar): ");
            for (String names : country) {
                System.out.println(names);
            }
            System.out.println("Total number of country: " + country.size());

            country.add("Egypt");
            System.out.println("New Total number of country: " + country.size());
            for (String names : country) {
                System.out.println(names);
            }

            country.clear();
            System.out.println("country Names(After removing all cars): ");
            for (String names : country) {
                System.out.println(names);
            }
            System.out.println("Total number of country: " + country.size());
        }
}

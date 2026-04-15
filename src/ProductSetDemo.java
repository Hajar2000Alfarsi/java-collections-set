import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        productNames.add("Laptop");
        productNames.add("Phone");
        productNames.add("Tablet");
        productNames.add("Headphones");
        productNames.add("Smart Watch");

        System.out.println("product Names: ");
        for (String names : productNames) {
            System.out.println(names);
        }

        productNames.add("Headphones");
        System.out.println("product Names(After Add Headphones): ");
        for (String names : productNames) {
            System.out.println(names);
        }

        boolean exists = productNames.contains("Tablet");
        System.out.println("Does Tablet exist? " + exists);

        productNames.remove("Phone");
        System.out.println("product Names(After removing Phone): ");
        for (String names : productNames) {
            System.out.println(names);
        }
        System.out.println("Total number of products: " + productNames.size());

        productNames.clear();
        System.out.println("product Names(After removing all products ): ");
        for (String names : productNames) {
            System.out.println(names);
        }
        System.out.println("Total number of products: " + productNames.size());
    }
    }

import java.util.HashSet;
import java.util.Set;

public class RemoveSetDemo {
    public static void main(String[] args){
        Set<String> productName=new HashSet<>();

        productName.add("Laptop");
        productName.add("Mouse");
        productName.add("Keyboard");
        productName.add("Monitor");
        productName.add("Printer");

        System.out.println("Product Name:");
        for(String name:productName){
            System.out.println(name);
        }

        productName.remove("Printer");

        System.out.println("Product Name:");
        for(String name:productName){
            System.out.println(name);
        }

    }
}

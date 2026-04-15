import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
      public static void main(String[] args){
          Set<String> cityNames= new HashSet<>();
          cityNames.add("Muscat");
          cityNames.add("Salalah");
          cityNames.add("Sohar");
          cityNames.add("Nizwa");
          cityNames.add("Sur");

          System.out.println("City Names: ");
          for (String names:cityNames){
              System.out.println(names);
          }

          cityNames.add("Muscat");
          System.out.println("City Names(After Add city Muscat): ");
          for (String names:cityNames){
              System.out.println(names);
          }

          boolean exists=cityNames.contains("Sur");
          System.out.println("Does Sur exist? " + exists);

          cityNames.remove("Muscat");
          System.out.println("City Names(After removing city Muscat): ");
          for (String names:cityNames){
              System.out.println(names);
          }
          System.out.println("Total number of Cites: " + cityNames.size());

          cityNames.clear();
          System.out.println("City Names(After removing all Cites): ");
          for (String names:cityNames){
              System.out.println(names);
          }
          System.out.println("Total number of Cites: " + cityNames.size());
      }
}

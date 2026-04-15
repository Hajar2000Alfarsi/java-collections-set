import java.util.HashSet;
import java.util.Set;

public class AppSetDemo {
   public static void main(String[] args) {
       Set<String> mobileAppNames = new HashSet<>();
       mobileAppNames.add("WhatsApp");
       mobileAppNames.add("Instagram");
       mobileAppNames.add("Snapchat");
       mobileAppNames.add("TikTok");
       mobileAppNames.add("YouTube");

       System.out.println(" mobile app names: ");
       for (String name:mobileAppNames){
           System.out.println(name);
       }

       mobileAppNames.add("TikTok");
       System.out.println(" mobile app names: ");
       for (String name:mobileAppNames){
           System.out.println(name);
       }

       boolean exists=mobileAppNames.contains("Snapchat");
       System.out.println("Does Snapchat exist? " + exists);

       mobileAppNames.remove("Instagram");
       System.out.println("mobile app names: ");
       for (String name:mobileAppNames){
           System.out.println(name);
       }

       System.out.println("Total number of mobile app: " + mobileAppNames.size());

       mobileAppNames.clear();
       System.out.println("mobile app names: ");
       for (String name:mobileAppNames){
           System.out.println(name);
       }

       System.out.println("Total number of book title: " + mobileAppNames.size());
   }
}

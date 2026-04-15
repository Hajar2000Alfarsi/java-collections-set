import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {
    public static void main(String[] args){
        Set<String> websiteNames = new HashSet<>();
        websiteNames.add("google.com");
        websiteNames.add("youtube.com");
        websiteNames.add("amazon.com");
        websiteNames.add("wikipedia.org");
        websiteNames.add("github.com");

        System.out.println("Website Names: ");
        for (String names:websiteNames){
            System.out.println(names);
        }

        websiteNames.add("youtube.com");
        System.out.println("Website Names(After Add youtube.com): ");
        for (String names:websiteNames){
            System.out.println(names);
        }

        boolean exists=websiteNames.contains("wikipedia.org");
        System.out.println("Does wikipedia.org exist? " + exists);

        websiteNames.remove("github.com");
        System.out.println("Website Names(After removing github.com): ");
        for (String names:websiteNames){
            System.out.println(names);
        }
        System.out.println("Total number of Websites: " + websiteNames.size());

        websiteNames.clear();
        System.out.println("Movie Names(After removing all Website ): ");
        for (String names:websiteNames){
            System.out.println(names);
        }
        System.out.println("Total number of Websites: " + websiteNames.size());

    }
}

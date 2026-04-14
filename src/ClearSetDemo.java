import java.util.HashSet;
import java.util.Set;

public class ClearSetDemo {
    public static void main(String[] args){
        Set<String> userNames=new HashSet<>();
        userNames.add("Ali");
        userNames.add("Sara");
        userNames.add("Omar");
        userNames.add("Nora");
        userNames.add("Hassan");

        System.out.println("User Names: ");
        for (String names:userNames){
            System.out.println(names);
        }
        System.out.println("number of users: " + userNames.size());

        userNames.clear();

        System.out.println("User Names after clearing: ");
        for (String names:userNames){
            System.out.println(names);
        }
        System.out.println("number of users: " + userNames.size());
    }
}

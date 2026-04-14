import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
    public static void main(String[] args){
        Set<String> studentNames=new HashSet<>();
        studentNames.add("Ahmed");
        studentNames.add("Sara");
        studentNames.add("Omar");
        studentNames.add("Lina");
        studentNames.add("Nora");

        System.out.println("User Names: ");
        for (String names:studentNames){
            System.out.println(names);
        }

        studentNames.add("Sara");

        System.out.println("Deplicate one User Names: ");
        for (String names:studentNames){
            System.out.println(names);
        }

        boolean exists = studentNames.contains("Omar");
        System.out.println("Does Omar exist? " + exists);

        studentNames.remove("Lina");

        System.out.println("Remove one User Names: ");
        for (String names:studentNames){
            System.out.println(names);
        }

        System.out.println("Total students: " + studentNames.size());

        studentNames.clear();

        System.out.println("clear User Names: ");
        for (String names:studentNames){
            System.out.println(names);
        }
        System.out.println("Size after clear: " + studentNames.size());
    }
}

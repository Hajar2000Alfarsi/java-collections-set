import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo {
    public static void main(String[] args){
        Set<String> courseName=new HashSet<>();
        courseName.add("Java Programming");
        courseName.add("Data Structures");
        courseName.add("Web Development");
        courseName.add("Database Systems");
        courseName.add("Cyber Security");

        System.out.println("Courses Names: ");
        for (String names:courseName){
            System.out.println(names);
        }

        courseName.add("Database Systems");
        System.out.println("Courses Names(After Add course Database Systems): ");
        for (String names:courseName){
            System.out.println(names);
        }

        boolean exists=courseName.contains("Java Programming");
        System.out.println("Does Java Programming exist? " + exists);

        courseName.remove("Cyber Security");
        System.out.println("Courses Names(After removing course Cyber Security): ");
        for (String names:courseName){
            System.out.println(names);
        }
        System.out.println("Total number of Courses: " + courseName.size());

        courseName.clear();
        System.out.println("Courses Names(After removing all courses): ");
        for (String names:courseName){
            System.out.println(names);
        }
        System.out.println("Total number of Courses: " + courseName.size());
    }
}

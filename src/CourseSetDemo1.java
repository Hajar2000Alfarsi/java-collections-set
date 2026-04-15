import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo1 {
    public static void main(String[] args) {
        Set<String> courseName = new HashSet<>();
        courseName.add("Java");
        courseName.add("Python");
        courseName.add("Database");
        courseName.add("Networking");
        courseName.add("Web Design");

        System.out.println("Courses Names: ");
        for (String names : courseName) {
            System.out.println(names);
        }

        courseName.add("Database");
        System.out.println("Courses Names(After Add course Database): ");
        for (String names : courseName) {
            System.out.println(names);
        }

        boolean exists = courseName.contains("Networking");
        System.out.println("Does Networking exist? " + exists);

        boolean exists1 = courseName.contains("AI");
        System.out.println("Does AI exist? " + exists1);

        courseName.remove("Python");
        System.out.println("Courses Names(After removing course Python): ");
        for (String names : courseName) {
            System.out.println(names);
        }

        courseName.remove("Java");
        System.out.println("Courses Names(After removing course Python): ");
        for (String names : courseName) {
            System.out.println(names);
        }
        System.out.println("Total number of Courses: " + courseName.size());

        courseName.add("Machine Learning");
        System.out.println("New Total number of Courses: " + courseName.size());

        courseName.clear();
        System.out.println("Courses Names(After removing all courses): ");
        for (String names : courseName) {
            System.out.println(names);
        }
        System.out.println("Total number of Courses: " + courseName.size());
    }
}

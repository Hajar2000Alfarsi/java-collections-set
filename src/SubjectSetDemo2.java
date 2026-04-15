import java.util.HashSet;
import java.util.Set;

public class SubjectSetDemo2 {
    public static void main(String[] args) {
        Set<String> subjects  = new HashSet<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("History");
        subjects.add("Computer");

        System.out.println("subject Names: ");
        for (String names : subjects) {
            System.out.println(names);
        }

        subjects.add("Math");
        System.out.println("Subject Names(After Add Math): ");
        for (String names : subjects) {
            System.out.println(names);
        }

        boolean exists = subjects.contains("Science");
        System.out.println("Does Science exist? " + exists);
        boolean exists1 = subjects.contains("Art");
        System.out.println("Does Art exist? " + exists1);


        subjects.remove("History");
        System.out.println("Courses Names(After removing History): ");
        for (String names : subjects) {
            System.out.println(names);
        }

        subjects.remove("English");
        System.out.println("Courses Names(After removing English): ");
        for (String names : subjects) {
            System.out.println(names);
        }
        System.out.println("Total number of Courses: " + subjects.size());

        subjects.add("Geography");
        System.out.println("New Total number of Courses: " + subjects.size());

        subjects.clear();
        System.out.println("Courses Names(After removing all subjects): ");
        for (String names : subjects) {
            System.out.println(names);
        }
        System.out.println("Total number of subjects: " + subjects.size());
    }
}

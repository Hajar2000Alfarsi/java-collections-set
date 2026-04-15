import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args){
        Set<String> bookTitle=new HashSet<>();
        bookTitle.add("The Alchemist");
        bookTitle.add("Atomic Habits");
        bookTitle.add("Clean Code");
        bookTitle.add("The Hobbit");
        bookTitle.add("Harry Potter");

        System.out.println("Book Title: ");
        for (String title:bookTitle){
            System.out.println(title);
        }

        bookTitle.add("Harry Potter");
        System.out.println("Book Title: ");
        for (String title:bookTitle){
            System.out.println(title);
        }

        boolean exists=bookTitle.contains("The Hobbit");
        System.out.println("Does The Hobbit exist? " + exists);

        bookTitle.remove("Clean Code");
        System.out.println("Book Title: ");
        for (String title:bookTitle){
            System.out.println(title);
        }

        System.out.println("Total number of book title: " + bookTitle.size());

        bookTitle.clear();
        System.out.println("Book Title: ");
        for (String title:bookTitle){
            System.out.println(title);
        }

        System.out.println("Total number of book title: " + bookTitle.size());

    }
}

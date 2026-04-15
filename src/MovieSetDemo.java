import java.util.HashSet;
import java.util.Set;

public class MovieSetDemo {
    public static void main(String[] args){
        Set<String> movieNames= new HashSet<>();
        movieNames.add("Inception");
        movieNames.add("Titanic");
        movieNames.add("Avatar");
        movieNames.add("The Dark Knight");
        movieNames.add("Interstellar");

        System.out.println("Movie Names: ");
        for (String names:movieNames){
            System.out.println(names);
        }

        movieNames.add("Interstellar");
        System.out.println("Movie Names(After Add Interstellar): ");
        for (String names:movieNames){
            System.out.println(names);
        }

        boolean exists=movieNames.contains("Avatar");
        System.out.println("Does Avatar exist? " + exists);

        movieNames.remove("Titanic");
        System.out.println("Movie Names(After removing Titanic): ");
        for (String names:movieNames){
            System.out.println(names);
        }
        System.out.println("Total number of Movies: " + movieNames.size());

        movieNames.clear();
        System.out.println("Movie Names(After removing all movies ): ");
        for (String names:movieNames){
            System.out.println(names);
        }
        System.out.println("Total number of Movie: " + movieNames.size());
    }
}

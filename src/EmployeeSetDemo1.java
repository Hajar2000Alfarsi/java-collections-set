import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo1 {
    public static void main(String[] args){
        Set<String> employees=new HashSet<>();
        employees.add("Ali");
        employees.add("Sara");
        employees.add("Omar");
        employees.add("Noor");
        employees.add("Maha");

        System.out.println("Employee names: ");
        for (String name:employees){
            System.out.println(name);
        }

        employees.add("Hassan");
        System.out.println("Employee names: ");
        for (String name:employees){
            System.out.println(name);
        }
        employees.add("Ali");
        System.out.println("Employee names: ");
        for (String name:employees){
            System.out.println(name);
        }

        boolean exists=employees.contains("Sara");
        System.out.println("Is employee name contains Sara: " + exists);
        boolean exists1=employees.contains("kalid");
        System.out.println("Is employee name contains kalid: " + exists1);

        employees.remove("Omar");
        System.out.println("Employee names After delete Omar: ");
        for (String name:employees){
            System.out.println(name);
        }
        employees.remove("Noor");
        System.out.println("Employee names After delete Noor: ");
        for (String name:employees){
            System.out.println(name);
        }

        employees.add("Fatima");
        System.out.println("Employee names After adding Fatima: ");
        for (String name:employees){
            System.out.println(name);
        }

        System.out.println("number of employee: " + employees.size());

        employees.clear();
        System.out.println("Set after clear it : " + employees.size());

    }
}

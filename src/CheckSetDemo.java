import java.util.HashSet;
import java.util.Set;

public class CheckSetDemo {
    public static void main(String[] args){
        Set<String> EmployeeId=new HashSet<>();
        EmployeeId.add("E101");
        EmployeeId.add("E102");
        EmployeeId.add("E103");
        EmployeeId.add("E104");
        EmployeeId.add("E105");

        System.out.println("Employee Id: ");
        for(String id:EmployeeId){
            System.out.println(id);
        }

        boolean exists1= EmployeeId.contains("E103");
        System.out.println("Does E103 exist? " + exists1);
        boolean exists2= EmployeeId.contains("E022");
        System.out.println("Does E022 exist? " + exists2);
    }
}

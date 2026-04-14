import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main(String[] args){
        Set<String> employeeId=new HashSet<>();
        employeeId.add("E101");
        employeeId.add("E102");
        employeeId.add("E103");
        employeeId.add("E104");
        employeeId.add("E105");

        System.out.println("Employee Id: ");
        for (String id:employeeId){
            System.out.println(id);
        }

        employeeId.add("E105");
        System.out.println("Employee Id: ");
        for (String id:employeeId){
            System.out.println(id);
        }

        boolean exists=employeeId.contains("E103");
        System.out.println("Is employeeId contains E103: " + exists);

        employeeId.remove("E105");
        System.out.println("Employee Id After delete E105: ");
        for (String id:employeeId){
            System.out.println(id);
        }
        System.out.println("number of employee: " + employeeId.size());

        employeeId.clear();
        System.out.println("Set after clear it : " + employeeId.size());

    }
}

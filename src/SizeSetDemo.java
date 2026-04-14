import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
    public static void main(String[] args){
        Set<String> departmentNames=new HashSet<>();
        departmentNames.add("HR");
        departmentNames.add("IT");
        departmentNames.add("Finance");
        departmentNames.add("Marketing");
        departmentNames.add("Sales");

        System.out.println("Department Names");
        for (String dept:departmentNames){
            System.out.println(dept);
        }

        System.out.println("Number of department: " + departmentNames.size());

        departmentNames.add("Logistics");

        System.out.println("Number of department after adding Logistics department : " + departmentNames.size());
    }
}

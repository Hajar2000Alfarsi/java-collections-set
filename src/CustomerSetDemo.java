import java.util.HashSet;
import java.util.Set;

public class CustomerSetDemo {
    public static void main(String[] args){
        Set<String> CustomerId=new HashSet<>();
        CustomerId.add("C101");
        CustomerId.add("C102");
        CustomerId.add("C103");
        CustomerId.add("C104");
        CustomerId.add("C105");

        System.out.println("Customer Id:");
        for(String id:CustomerId){
            System.out.println(id);
        }

        CustomerId.add("C103");

        System.out.println("After Add One Customer ID that Already Exists- Customer Id:");
        for(String id:CustomerId){
            System.out.println(id);
        }
    }
    /* The c103 was not added to set as it added before
    * The Set does not allow duplicate elements.  */
}

import java.util.HashSet;
import java.util.Set;

public class task1 {
    public static void main(String[] args){
        Set<String> productCodes=new HashSet<>();
        productCodes.add("P1001");
        productCodes.add("P1002");
        productCodes.add("P1003");
        productCodes.add("P1004");
        productCodes.add("P1005");

        System.out.println("Product Code");
        for(String code:productCodes){
            System.out.println(code);
        }

        productCodes.add("P1006");
        System.out.println("After Add New Product Code");
        for(String code:productCodes){
            System.out.println(code);
        }
    }
}

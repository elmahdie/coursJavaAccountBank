import java.util.ArrayList;

public class Bank {
    static ArrayList<Customar> customers=new ArrayList<Customar>();

    public static void addCustomer(Customar customar) {
        customers.add(customar);
    }
    
}

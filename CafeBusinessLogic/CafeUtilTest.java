import java.util.ArrayList;
public class CafeUtilTest{
    public static void main(String[] args){
        CafeUtil test=new CafeUtil();

        System.out.println(test.getStreakGoal(5));

        double[] order={1,2,3,4,5,6,7,8,9};
        System.out.println(test.getOrderTotal(order));

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        test.displayMenu(menu);

        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Riyad");
        customers.add("Reina");
        customers.add("Saeed");
        customers.add("Ameer");
        test.addCustomer(customers);
    }
}
import java.util.ArrayList;
public class CafeUtil{
    public int getStreakGoal(){
        return getStreakGoal(10);
    }
    public int getStreakGoal(int numWeeks){
        int sum=0;
        for(int i=1;i<=numWeeks;i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double total=0;
        for(double price:prices){
            total+=price;
        }
        return total;
    }
    void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
            System.out.println(String.format(i + " " + menuItems.get(i)));
        }
    }
    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + "!");
        System.out.println("There are " + customers.size() + " in front of you");
        customers.add(userName);
        
    }
}
import java.util.Scanner;

public class ShoppingCartManager {
  public static void main(String[] args) { //should declare Shopping Cart that shopping cart should have ItemToPurhcase

        String customerName;
        String currentDate;
        // String description;
        
        
        Scanner scnr = new Scanner(System.in);
        
        //prompt user for Customer's Name and today's date  
        ShoppingCart shopper1 = new ShoppingCart();
        // ItemToPurchase fourControllers = new ItemToPurchase();
        // ItemToPurchase bikes = new ItemToPurchase();
        
        System.out.println("Enter Customer's Name:");
		    customerName = scnr.nextLine();
        System.out.println("Enter Today's Date:");
        System.out.println("");
        currentDate = scnr.nextLine();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Today's Date: " + currentDate);
        System.out.println("");

      

        shopper1.printMenu(shopper1);
        shopper1.getCostOfCart();
        
        // bikes.setName(customerName);
        // bikes.printItemCost();

        scnr.close();
  }
        
}

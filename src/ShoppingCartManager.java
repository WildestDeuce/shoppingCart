import java.util.Scanner;

public class ShoppingCartManager {
  public static void main(String[] args) { //should declare Shopping Cart that shopping cart should have ItemToPurhcase

        String customerName;
        String currentDate;
        // String description;
        
        
        Scanner sc= new Scanner(System.in);
        
        //prompt user for Customer's Name and today's date  
        
        System.out.println("Enter Customer's Name:");
		    customerName = sc.nextLine();
        System.out.println("Enter Today's Date:");
        System.out.println("");
        currentDate = sc.nextLine();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Today's Date: " + currentDate);
        System.out.println("");
        
        ShoppingCart shopper1 = new ShoppingCart(customerName, currentDate);
      
        shopper1.printMenu(shopper1);
        // shopper1.printOutputShoppingCart();
        // shopper1.printDescriptions();

        // String itemToAddName = sc.nextLine();
        // String itemToAddDesc = sc.nextLine();
        // int itemToAddPrice = sc.nextInt();
        // int itemToAddQuantity = sc.nextInt();
        
        // ItemToPurchase itemToAdd = new ItemToPurchase(itemToAddName, itemToAddDesc, itemToAddPrice, itemToAddQuantity);
        // shopper1.addItem(itemToAdd);
        
        // String itemName = sc.nextLine();
        // shopper1.removeItem(itemName);
        
        // ItemToPurchase itemToMod = new ItemToPurchase();
        // shopper1.modifyItem(itemToMod);
        shopper1.getCostOfCart();
        
        sc.close();
  }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private int i;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        ArrayList<String> cartItems = new ArrayList<String>();
        return;
    }

    public ShoppingCart(String name, String date) {
        customerName = name;
        currentDate = date;
        ArrayList<String> cartItems = new ArrayList<String>();
        return;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
        return;
    }

    public void setCurrentDate(String date) {
        this.currentDate = date;
        return;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase itemToPurchase) {
        cartItems.add(itemToPurchase);
        return;
    }

    public void removeItem(String itemName) {
        cartItems.remove(itemName);
        boolean isRemoved = cartItems.remove(itemName);
         
        if(!isRemoved) {
            System.out.println("Item not found in cart. Nothing removed.");
        }
        return;
    }

    public int getCostOfCart() {
        int costOfCart = 0;
        for (i = 0; i <cartItems.size(); i++) {
             costOfCart += (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity());
             }
        return costOfCart;
}   

    public int getNumItemsInCart() {
        int itemCount = 0;
        for(ItemToPurchase cartItem: cartItems) {
            itemCount += cartItem.getQuantity();
        }

        return itemCount;
    }
  
    public void modifyItem(ItemToPurchase itemToPurchase) {
        //old item
        for (i = 0; i < cartItems.size(); i++) {
             ItemToPurchase oldItem = cartItems.get(i);
            // item.getName();
            if (oldItem.getName().equals(itemToPurchase.getName())) {
                //new item compared to default property
                if ((itemToPurchase.getDescription() != "none") && (itemToPurchase.getQuantity() != 0) && (itemToPurchase.getPrice() != 0)){
                    oldItem.setDescription(itemToPurchase.getDescription());
                    oldItem.setQuantity(itemToPurchase.getQuantity());
                    oldItem.setPrice(itemToPurchase.getPrice());

                    cartItems.set(i, oldItem);
                }
                        
           } else {
               System.out.println("Item not found in cart. Nothing modified.");
           }
        }
    }
    
    //outputs toalt objects in cart. If empty, output "SHOPPING CART IS EMPTY"
    public void printTotal() {
       
        System.out.println(customerName +"'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());
        for (i = 0; i < cartItems.size(); i++) {
            ItemToPurchase currentItem = cartItems.get(i);
            System.out.println(currentItem.getName() + currentItem.getQuantity() + 
            " @ $" + currentItem.getPrice() + " = $" + (currentItem.getQuantity() * currentItem.getPrice()));
            System.out.println("Total: $" /*+ getCostOfCart()*/);
        }
    }

    //outputs eacht item's description
    public void printDescriptions() {
        System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
        System.out.println(customerName +"'s Shopping Cart - " + currentDate);
        System.out.println();
        System.out.println("Item Descriptions");
        for (i = 0; i < cartItems.size(); i++) {
            ItemToPurchase currentItem = cartItems.get(i);
            System.out.println(currentItem.getName() + ": " + currentItem.getDescription()); 
        }
    }   

    public void printOutputShoppingCart() {
        ItemToPurchase cartCheck = new ItemToPurchase();
        System.out.println("OUTPUT SHOPPING CART");
        System.out.println(customerName +"'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart() );

        if (getNumItemsInCart() == 0) {
            System.out.println("SHOPPING CART IS EMPTY"); 
        }
        System.out.println("Total: $" + getCostOfCart());
    }
    
    public void printMenu(ShoppingCart userCart) {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("");
    
        
        
        char menuOp = '\0';
        while(menuOp != 'a' && menuOp != 'd' && menuOp != 'c' &&
                menuOp != 'i' && menuOp != 'o' && menuOp != 'q') {
            System.out.println("Choose an option:");
            char option;
            option = sc.next().charAt(0);
            sc.nextLine();
            switch (option) {
                case 'a':
                    System.out.println("ADD ITEM TO CART");
                    System.out.println("Enter the item name:");
                    String userNameInput = sc.nextLine();
                
    
                    System.out.println("Enter the item description:");
                    String userDescriptionInput = sc.nextLine();
    
                    System.out.println("Enter the item price:");
                    int userPriceInput = Integer.parseInt(sc.nextLine());
    
                    System.out.println("Enter the item quantity:");
                    int userQuantityInput = Integer.parseInt(sc.nextLine());
    
                    ItemToPurchase newItem = new ItemToPurchase(userNameInput, userDescriptionInput, userPriceInput, userQuantityInput);
                    addItem(newItem);
    
                    System.out.println();
                    break;          
             
                case 'd':
                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove");
                    String userInput = sc.nextLine();
                    removeItem(userInput);
                    break;

                case 'c':
                    String modNameInput = sc.nextLine();
                    String modDescrptionInput = sc.nextLine();
                    int modPriceInput = Integer.parseInt(sc.nextLine());
                    int modQuanityInput = Integer.parseInt(sc.nextLine());

                    ItemToPurchase itemToModify = new ItemToPurchase(modNameInput, modDescrptionInput, modPriceInput, modQuanityInput);

                    modifyItem(itemToModify);
                    break;

                case 'i':
                    printDescriptions();
                    break;

                    case 'o': //output shopping
                        printOutputShoppingCart();
                        break;
    
                case 'q':
                    return;  

                default:
                    System.out.println("Choose an option:");
                    System.out.println();
                    break;   
        }
    }  
       
   }
}
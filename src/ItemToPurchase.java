public class ItemToPurchase {
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   private String itemDescription;
   
   //default constructor
   public ItemToPurchase() {
      itemName = "none";
      itemDescription = "none";
      itemPrice = 0;
      itemQuantity = 0;
      return;
   }

   public ItemToPurchase(String itemName, String itemDescription,  int itemPrice, int itemQuantity) {
      this.itemName = itemName;
      this.itemDescription = itemDescription;
      this.itemPrice = itemPrice;
      this.itemQuantity = itemQuantity;
      return;
   }
   
   public void setName(String name) {
      itemName = name;
      return;
   }
   
   public void setPrice(int price) {
      itemPrice = price;
      return;
   }
   
   public void setQuantity(int quantity) {
      itemQuantity = quantity;
      return;
   }

   public void setDescription(String description) {
      itemDescription = description;
      return;
   }
   
   public String getName() {
      return itemName;
   }
   
   public int getPrice() {
      return itemPrice;
   }
   
   public int getQuantity() {
      return itemQuantity;
   }

   public String getDescription() {
      return itemDescription;
   }

   public void printItemCost() {
      System.out.print(itemName + " " + itemQuantity + "@ $" + itemPrice + "=" + (itemPrice * itemQuantity));
   }

   public void pirntItemDescription() {
      System.out.print(itemName + ": " + itemDescription);
   }

   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}

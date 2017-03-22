
package restaurant;

/**
 *
 * @author Gareth
 */
public class MenuItem {
    private String itemName;
    private double itemPrice;
    private int inventoryNumber;
    
    public MenuItem(String name, double price, int inventory){
        itemName = name;
        itemPrice = price;
        inventoryNumber = inventory;
    }
    
    public void setName(String name){
        itemName = name;
    }
    
    public String getName(){
        return itemName;
    }
    
    public void setPrice(double price){
        itemPrice = price;
    }
    
    public double getPrice(){
        return itemPrice;
    }
    
    //adds whatever the passed in value is to inventory value already existant
    public void setInventory(int inventory){
        inventoryNumber += inventory;
    }
    
    public int getInventory(){
        return inventoryNumber;
    }
    
    public void printMenu(){
        System.out.println(itemName);
        System.out.println(itemPrice);
        System.out.println(inventoryNumber);
    }
    
}

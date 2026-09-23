package Opgave6;
import java.util.ArrayList;
public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity = 10;

    public Inventory(String playerName){
        this.playerName = playerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        if (items.size() < maxCapacity){
            items.add(item);
        } else {
            System.out.println("Full capacity");
        }
    }

    public void getTotalValue(){
        int total = 0;
        for (Item item : items){
            total = total + item.getValue();
        }
        System.out.println(total);
    }

    public void findItemsByType(String type){
        ArrayList<Item> found = new ArrayList<>();
        for (Item item: items){
            if (item.getType().equals(type)){
                items.add(item);
            }
            System.out.println(found);
        }
    }

    public void printInventory(){
        System.out.println(playerName+" inventory");
        for (Item item : items){
            System.out.println(item);
        }
        System.out.println();
    }
}

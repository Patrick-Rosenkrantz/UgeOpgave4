package Opgave6;

public class Main {
    void main() {
        Inventory p1 = new Inventory("Golden Goose");
        Inventory p2 = new Inventory("Banana fly");

        p1.addItem(new Item("Sword",100,"Weapon"));
        p1.addItem(new Item("Shield",80,"Defence"));
        p2.addItem(new Item("Football",10,"Entertainment"));
        p2.addItem(new Item("Gun",150,"Weapon"));


        p1.printInventory();
        p2.printInventory();

        Item.getTotalItemsCreated();

        p1.getTotalValue();
        p2.getTotalValue();




    }
}

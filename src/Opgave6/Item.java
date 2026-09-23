package Opgave6;

public class Item {
    private String name;
    private int value;
    private String type;
    private static int totalItemsCreated = 0;

    Item(String name, int value, String type){
        this.name = name;
        this.value = value;
        this.type = type;
        totalItemsCreated++;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    public String getType(){
        return type;
    }

    public static void getTotalItemsCreated(){
        System.out.println("Total items: "+totalItemsCreated);
    }

    public String toString(){
        return "Item name: "+name+ " | Value: "+value+" | Type: "+type;
    }
}

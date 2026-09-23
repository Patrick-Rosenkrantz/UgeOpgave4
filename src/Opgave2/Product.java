package Opgave2;

public class Product {
    String name;
    double price;
    String[] tags;
    StringBuilder sb = new StringBuilder();


    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }


    public void printInfo() {
        System.out.println(name);
        System.out.println(price);
        for (String tag : tags) {
            System.out.println(tag + ", ");
        }
    }

    public boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tags)) {
                return true;
            }
        } return  false;
    }
}



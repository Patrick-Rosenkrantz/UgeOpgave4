package Opgave2;

public class Main {
    Product product1 = new Product("Laptop", 100, new String[] {"New", "Electronics", "sale"});
    Product product2 = new Product("Phone", 50, new String[] {"New", "Electronics", "sale"});
    Product product3 = new Product("Dishwasher", 200, new String[] {"Affordable", "electronics", "sale"});
    Product product4 = new Product("Knife", 10, new String[] {"New", "Silverware", "Affordable"});

    Product[] products = {product1,product2,product3,product4};

    public static Product findMostExpensive(Product[] products){
        Product mostExpensive = products[0];
        for (Product p : products) {
            if (p.price> mostExpensive.price){
                mostExpensive = p;
            }
        } return mostExpensive;
    }
    public void main(){
        System.out.println(("most expensive product"));
        Product expensive = findMostExpensive(products);
        expensive.printInfo();

        System.out.println("products on sale: ");
        for (Product p : products){
            if (p.hasTag("sale")){
                p.printInfo();
            }
        }
    }
}

import java.util.*;

class Product {
    String productId;
    String name;
    double price;
    int quantity;

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product p) {
        if (products.containsKey(p.productId)) {
            Product existing = products.get(p.productId);
            existing.quantity += p.quantity;
            System.out.println("Product " + p.productId + " already exists. Updated quantity.");
        } else {
            products.put(p.productId, p);
            System.out.println("Product " + p.productId + " added.");
        }
    }

    public void sellProduct(String productId, int quantity) {
        Product p = products.get(productId);
        if (p == null) {
            System.out.println("Product " + productId + " does not exist.");
        } else if (p.quantity < quantity) {
            System.out.println("Not enough quantity for product " + productId + ".");
        } else {
            p.quantity -= quantity;
            System.out.println("Product " + productId + " sold. Remaining quantity: " + p.quantity);
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product p : products.values()) {
            System.out.println("ID: " + p.productId + ", Name: " + p.name + ", Price: " + p.price + ", Quantity: " + p.quantity);
        }
    }

    public double getInventoryValue() {
        double total = 0;
        for (Product p : products.values()) {
            total += p.price * p.quantity;
        }
        return total;
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product("P001", "Pen", 10.0, 100));
        inv.addProduct(new Product("P002", "Notebook", 50.0, 200));
        inv.addProduct(new Product("P001", "Pen", 10.0, 50));
        inv.sellProduct("P001", 120);
        inv.sellProduct("P002", 20);
        inv.displayInventory();
        System.out.println("Total Inventory Value: " + inv.getInventoryValue());
    }
}
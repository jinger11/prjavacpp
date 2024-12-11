/*
Using concepts of Object-Oriented programming develop solution for any an application Inventory management system having following operations : 1. List of all products 2. Display individual product information 3. Purchase 4. Shipping 5. Balance stock 6. Loss and Profit calculation.
*/
import java.util.*;

// Class to represent a Product
class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;
    private int sold;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.sold = 0;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getSold() {
        return sold;
    }

    // Purchase a product
    public boolean purchase(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            sold += quantity;
            System.out.println(quantity + " units of " + name + " purchased successfully!");
            return true;
        } else {
            System.out.println("Insufficient stock for " + name + ".");
            return false;
        }
    }

    // Display product information
    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Stock: " + stock);
        System.out.println("Sold: " + sold);
    }

    // Calculate total revenue from sold items
    public double calculateRevenue() {
        return sold * price;
    }
}

// Class for Inventory Management
class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a product to inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // List all products
    public void listAllProducts() {
        System.out.println("All Products:");
        for (Product product : products) {
            System.out.println(product.getProductId() + ". " + product.getName());
        }
    }

    // Display individual product information
    public void displayProductInfo(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.displayInfo();
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    // Handle purchase
    public void purchaseProduct(int productId, int quantity) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.purchase(quantity);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    // Calculate total balance stock
    public void calculateBalanceStock() {
        System.out.println("Balance Stock:");
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getStock() + " units");
        }
    }

    // Calculate profit
    public void calculateProfit() {
        double totalProfit = 0;
        for (Product product : products) {
            totalProfit += product.calculateRevenue();
        }
        System.out.println("Total Revenue: ₹" + totalProfit);
    }
}

// Main Class
public class Practical24 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products to inventory
        inventory.addProduct(new Product(1, "Laptop", 50000, 10));
        inventory.addProduct(new Product(2, "Smartphone", 15000, 20));
        inventory.addProduct(new Product(3, "Tablet", 20000, 15));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System:");
            System.out.println("1. List All Products");
            System.out.println("2. Display Product Information");
            System.out.println("3. Purchase Product");
            System.out.println("4. Display Balance Stock");
            System.out.println("5. Calculate Profit");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inventory.listAllProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    inventory.displayProductInfo(productId);
                    break;
                case 3:
                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    inventory.purchaseProduct(productId, quantity);
                    break;
                case 4:
                    inventory.calculateBalanceStock();
                    break;
                case 5:
                    inventory.calculateProfit();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

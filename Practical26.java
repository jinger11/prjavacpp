/*
 Implement and apply Strategy Design pattern for simple Shopping Cart where three payment strategies are used such as Credit Card, PayPal, Bit Coin. Create an interface for strategy pattern and give concrete implementation for payment.
*/

// Payment Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Implementation: CreditCardPayment
class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card (Card Number: " + cardNumber + ").");
    }
}

// Concrete Implementation: PayPalPayment
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal (Email: " + email + ").");
    }
}

// Concrete Implementation: BitcoinPayment
class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Bitcoin (Wallet: " + walletAddress + ").");
    }
}

// ShoppingCart class
class ShoppingCart {
    private double totalAmount;

    public void addItem(double price) {
        totalAmount += price;
        System.out.println("Item added to cart. Price: ₹" + price);
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        System.out.println("Total Amount: ₹" + totalAmount);
        paymentStrategy.pay(totalAmount);
    }
}

// Main Class
public class Practical26 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the shopping cart
        cart.addItem(500.00);
        cart.addItem(1200.00);
        cart.addItem(300.00);

        // Using Credit Card Payment Strategy
        System.out.println("\nPayment using Credit Card:");
        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234-5678-9876-5432", "123", "12/25");
        cart.checkout(creditCardPayment);

        // Using PayPal Payment Strategy
        System.out.println("\nPayment using PayPal:");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.checkout(payPalPayment);

        // Using Bitcoin Payment Strategy
        System.out.println("\nPayment using Bitcoin:");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1A2B3C4D5E6F7G8H");
        cart.checkout(bitcoinPayment);
    }
}

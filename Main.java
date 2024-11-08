import javax.swing.*;

public class Main {
    static class Car {
        String name;
        int price;

        Car(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Car[] cars = {
            new Car("TOTOYA SUPERA", 100),
            new Car("DOGGE CHARGER", 200),
            new Car("ABAKATATA", 300),
            new Car("ELAMBURGAMBOR", 400),
            new Car("FARIRIRE", 500)
        };

        double totalAmount = 0.0;

        JOptionPane.showMessageDialog(null, "Welcome to NAVS CAR RESELLER");

        int choice;
        do {
            // Show product options
            StringBuilder options = new StringBuilder("Choose the car you want to purchase:\n");
            for (int i = 0; i < cars.length; i++) {
                options.append(i + 1).append(". ").append(cars[i].name).append(" ------ $").append(cars[i].price).append("\n");
            }

            choice = Integer.parseInt(JOptionPane.showInputDialog(options.toString() + "Enter Item (1-5):"));

            if (choice < 1 || choice > 5) {
                JOptionPane.showMessageDialog(null, "Invalid choice! Please select a valid item (1-5).");
                continue;
            }

            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity:"));
            double result = cars[choice - 1].price * quantity;
            totalAmount += result;

            JOptionPane.showMessageDialog(null, "Your total for " + cars[choice - 1].name + " is: $" + String.format("%.2f", result));

            // Ask if they want to buy more
            choice = JOptionPane.showConfirmDialog(null, "Do you want to buy more items?", "Continue", JOptionPane.YES_NO_OPTION);
        } while (choice == JOptionPane.YES_OPTION);

        // Final amount and cash handling
        JOptionPane.showMessageDialog(null, "Your total purchase is: $" + String.format("%.2f", totalAmount));
        double cash;

        do {
            cash = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of cash:"));
            if (cash < totalAmount) {
                JOptionPane.showMessageDialog(null, "Insufficient cash. Please enter an amount equal to or greater than the total purchase.");
            }
        } while (cash < totalAmount);

        double change = cash - totalAmount;
        JOptionPane.showMessageDialog(null, "Your change is: $" + String.format("%.2f", change));

        // Receipt option
        int receipt = JOptionPane.showConfirmDialog(null, "Do you want a receipt?", "Receipt", JOptionPane.YES_NO_OPTION);
        if (receipt == JOptionPane.YES_OPTION) {
            StringBuilder receiptMessage = new StringBuilder("**** RECEIPT ****\n");
            receiptMessage.append("NAVS CAR SHOP\n")
                          .append("Total amount: $").append(String.format("%.2f", totalAmount)).append("\n")
                          .append("Cash provided: $").append(String.format("%.2f", cash)).append("\n")
                          .append("Change: $").append(String.format("%.2f", change)).append("\n")
                          .append("**********************");
            JOptionPane.showMessageDialog(null, receiptMessage.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Thank you for shopping! No receipt requested.");
        }

        JOptionPane.showMessageDialog(null, "Thank you for visiting NAVS CAR SHOP!");
    }
}

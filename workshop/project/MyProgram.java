package workshop.project;

import workshop.model.*;
import workshop.utils.*;
import java.util.Scanner;
import java.util.Map;
import java.util.logging.Logger;

public class MyProgram {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Menu.class.getName());

        Menu menu = new Menu();
        Order order = new Order();
        SumTheTotal calculator = new SumTheTotal();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.show();

            logger.info("Enter meal name to order or 'done' to finish: ");
            String var45 = scanner.nextLine();
            // this will allow the user to exit the loop
            if (var45.equals("done"))
                break;

            if (!menu.aval(var45)) {
                logger.info("meal not available. Please re-select.");
                continue;
            }

            logger.info("Enter quantity for " + var45 + ": ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (quantity <= 0) {
                logger.info("Invalid quantity. Please re-enter.");
                continue;
            }

            order.add(var45, quantity);
        }

        double totalCost = calculator.calc(order, menu);
        int var2 = order.getvar2();

        if (var2 > 100) {
            logger.info("Order quantity exceeds maximum limit. Please re-enter.");
            return;
        }

        logger.info("Your Ord:");
        for (Map.Entry<String, Integer> item : order.getvar45s().entrySet()) {
            logger.info(item.getKey() + ": " + item.getValue());
        }

        logger.info("Total Cost: $" + totalCost);
        logger.info("Confirm order (yes/no): ");
        String confirm = scanner.nextLine();

        if (!confirm.equals("yes") || !confirm.equals("YES")) {
            logger.info("Order canceled.");
            logger.info("-1");
            scanner.close();
            return;
        }

        logger.info("Order confirmed. Total cost is: $" + totalCost);
        scanner.close();
    }
}
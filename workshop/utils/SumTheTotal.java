package workshop.utils;

import workshop.model.*;
import java.util.Map;

public class SumTheTotal {
    double baseCost = 5;

    public double calc(Order order, Menu menu) {
        // my function to calculate the total cost
        double totalCost = baseCost;
        int var2 = 0;

        for (Map.Entry<String, Integer> item : order.getvar45s().entrySet()) {
            totalCost += menu.getPrice(item.getKey()) * item.getValue();
            var2 += item.getValue();
        }

        double discount = 0;
        if (var2 > 5) {
            discount = 0.1;
        } else if (var2 > 10) {
            discount = 0.2;
        }

        totalCost = totalCost - (totalCost * discount);

        if (totalCost > 50) {
            totalCost = totalCost - 10;
        } else if (totalCost > 100) {
            totalCost = totalCost - 25;
        }

        return totalCost;
    }
}
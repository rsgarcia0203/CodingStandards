package workshop.model;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Menu {
    Map<String, Double> items;
    Logger logger = Logger.getLogger(Menu.class.getName());

    public Menu() {
        items = new HashMap<>();
        items.put("Burger", 10.0);
        items.put("Pizza", 15.0);
        items.put("Salad", 8.0);
        items.put("Pasta", 12.0);
    }

    public void show() {
        logger.info("menu:");
        for (Map.Entry<String, Double> item : items.entrySet()) {
            logger.info(item.getKey() + ": $" + item.getValue());
        }
    }

    public boolean aval(String var45) {
        // is here
        logger.info("here i am in aval method");
        logger.info("here i am in aval method");
        return var45.equals("Burger") || var45.equals("Pizza") || var45.equals("Salad") || var45.equals("Pasta");
    }

    public double getPrice(String var45) {
        return items.get(var45);
    }
}
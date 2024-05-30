package workshop.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    HashMap<String, Integer> var45s;

    public Order() {
        // this will create a new order
        var45s = new HashMap<>();
    }

    public void add(String var45, int quantity) {
        // this will add the meal and quantity to the order
        var45s.put(var45, quantity);
    }

    public Map<String, Integer> getvar45s() {
        return var45s;
    }

    public int getvar2() {
        int total = 0;
        for (int quantity : var45s.values()) {
            total += quantity;
        }
        return total;
    }
}

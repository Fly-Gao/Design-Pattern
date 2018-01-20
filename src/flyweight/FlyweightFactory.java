package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight chessFlyWeight = new ConcreteChess();
            map.put(color, chessFlyWeight);
            return chessFlyWeight;
        }
    }
}

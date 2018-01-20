package mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {
    Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String dName, Department department) {
        map.put(dName, department);
    }

    @Override
    public void command(String dName) {
        map.get(dName).selfAction();
    }
}

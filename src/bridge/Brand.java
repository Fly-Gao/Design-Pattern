package bridge;

public class Brand {
    public void sell() {
    }
}

class Lenovo extends Brand {
    @Override
    public void sell() {
        super.sell();
        System.out.println("sell Lenovo brand");
    }
}

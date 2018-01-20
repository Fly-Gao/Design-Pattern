package strategy;

public interface Strategy {
    void price();
}

class OldStrategy implements Strategy {
    @Override
    public void price() {
        System.out.println("老客户");
    }
}

class NewStrategy implements Strategy {
    @Override
    public void price() {
        System.out.println("旧客户");
    }
}

class NewOrOldStrategy implements Strategy {

    @Override
    public void price() {
        System.out.println("不老不新的客户");
    }
}

package bridge;

public interface Computer {
    void sale();
}

class DesktopComputer implements Computer {
    private Brand brand;

    public DesktopComputer(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void sale() {
        System.out.println("sell DesktopComputer");
        brand.sell();
    }
}
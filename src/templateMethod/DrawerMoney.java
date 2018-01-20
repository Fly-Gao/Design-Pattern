package templateMethod;

public abstract class DrawerMoney {
    private void start() {
        System.out.println("start");
    }

    protected abstract void loading();

    private void end() {
        System.out.println("end");
    }

    public void stream() {
        start();
        loading();
        end();
    }
}

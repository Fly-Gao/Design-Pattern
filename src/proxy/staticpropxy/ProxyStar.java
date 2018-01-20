package proxy.staticpropxy;

public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void sing() {
        star.sing();
    }
}

package mediator;

public class Finance implements Department {
    private Mediator m;

    public Finance(Mediator m) {
        this.m = m;
        m.register("finance", this);
    }

    @Override
    public void selfAction() {
        System.out.println("发工资！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，剩余资金多少钱");
    }
}

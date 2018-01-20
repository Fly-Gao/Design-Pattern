package mediator;

public class Development implements Department {
    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
        m.register("develop", this);
    }

    @Override
    public void selfAction() {
        System.out.println("科研新项目！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，正在科研需要资金");
        m.command("finance");
    }
}

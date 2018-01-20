package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTaker {
    private Memento memento;

    //通过容器方式添加多个备份点
    //private List<Memento> list = new ArrayList<>();

    public CareTaker(Memento memento) {
        this.memento = memento;
    }

    public CareTaker() {
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

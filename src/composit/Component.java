package composit;

/**
 * 抽象组件
 */
public interface Component {
    void operation();
}

interface Leaf extends Component{
}

interface Composite extends Component{
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}

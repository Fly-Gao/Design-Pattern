package iterator;

/**
 * 自定义游标接口
 */
public interface MyIterator {
    //将游标指向第一个元素
    void first();

    //将游标指向下一个元素
    void next();

    boolean hasNext();

    boolean isFirst();

    Object getCurrentObj();
}

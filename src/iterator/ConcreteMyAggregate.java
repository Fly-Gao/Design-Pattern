package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    public ConcreteMyAggregate() {
    }

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator createIterator() {
        return new ConcreteIterator();
    }

    /**
     * 使用内部类定义迭代器，方便使用外部类的方法
     */
    private class ConcreteIterator implements MyIterator {

        //定义游标，记录遍历的位置
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            cursor++;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}

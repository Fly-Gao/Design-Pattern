package iterator;

public class Client {
    public static void main(String[] args) {

        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.add(1);
        cma.add(2);
        cma.add(3);
        cma.add(4);
        cma.add(5);

        MyIterator iterator = cma.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}

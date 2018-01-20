package observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ObserverA observerA = new ObserverA();
        ObserverA observerB = new ObserverA();
        ObserverA observerC = new ObserverA();
        subject.register(observerA);
        subject.register(observerB);
        subject.register(observerC);

        subject.setState(100);
        System.out.println(observerA.getMyState());
        System.out.println(observerB.getMyState());
        System.out.println(observerC.getMyState());
    }
}

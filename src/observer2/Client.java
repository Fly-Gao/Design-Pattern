package observer2;

public class Client {


    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ObserverA observerA = new ObserverA();
        ObserverA observerB = new ObserverA();
        ObserverA observerC = new ObserverA();

        concreteSubject.addObserver(observerA);
        concreteSubject.addObserver(observerB);
        concreteSubject.addObserver(observerC);

        concreteSubject.setState(200);
        System.out.println(observerA.getState());
        System.out.println(observerB.getState());
        System.out.println(observerC.getState());

    }
}

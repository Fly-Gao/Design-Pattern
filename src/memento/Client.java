package memento;

public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("jack", 22);
        taker.setMemento(emp.memento());
        System.out.println(emp.toString());
        emp.setAge(20);
        System.out.println(emp.toString());
        emp.recovery(taker.getMemento());
        System.out.println(emp.toString());
    }
}

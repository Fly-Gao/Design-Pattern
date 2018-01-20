package observer;

public class ObserverA implements Observer {
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).state;
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}

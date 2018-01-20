package mediator;

public interface Mediator {
    void register(String dName, Department department);

    void command(String dName);
}

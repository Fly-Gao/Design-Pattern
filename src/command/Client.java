package command;

/**
 * 命令模式，用于处理多个命令时有良好的扩展性
 */
public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}

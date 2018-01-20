package flyweight;

/**
 * 可共享的状态
 */
public class ConcreteChess implements ChessFlyWeight {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println(coordinate.toString());
    }
}

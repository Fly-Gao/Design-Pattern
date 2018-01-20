package flyweight;

public interface ChessFlyWeight {
    void setColor(String color);

    String getColor();

    void display(Coordinate coordinate);
}

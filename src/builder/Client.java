package builder;

public class Client {
    public static void main(String[] args){
        AirShipDirector director = new AirShipDirectorImpl(new AirShipBuilderImpl());
        AirShip ship = director.directorAirShip();

    }
}

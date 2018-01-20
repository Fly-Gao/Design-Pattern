package builder;

public class AirShipDirectorImpl implements AirShipDirector {
    private AirShipBuilder builder;

    public AirShipDirectorImpl(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setOrbitalModule(orbitalModule);
        airShip.setEscapeTower(escapeTower);
        return airShip;
    }
}

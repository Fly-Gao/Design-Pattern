package builder;

public class AirShip {
    private OrbitalModule orbitalModule;
    private Engine engine;

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    private EscapeTower escapeTower;

    public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escapeTower = escapeTower;
    }

    public AirShip() {
    }
}

class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public OrbitalModule() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Engine {
    public Engine() {
    }

    public Engine(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower {
    private String name;

    public EscapeTower() {

    }

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

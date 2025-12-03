class House {
    String foundation, walls, roof;
}

interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    House getHouse();
}

class WoodenHouseBuilder implements HouseBuilder {
    House h = new House();
    public void buildFoundation() { h.foundation = "Wood Foundation"; }
    public void buildWalls() { h.walls = "Wood Walls"; }
    public void buildRoof() { h.roof = "Wood Roof"; }
    public House getHouse() { return h; }
}

class Director {
    public House construct(HouseBuilder builder) {
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        return builder.getHouse();
    }
}

public class Main {
    public static void main(String[] args) {
        Director d = new Director();
        House home = d.construct(new WoodenHouseBuilder());
        System.out.println(home.roof);
    }
}

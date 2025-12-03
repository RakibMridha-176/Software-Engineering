interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() { System.out.println("Car started"); }
    public void stop()  { System.out.println("Car stopped"); }
}

class Bike implements Vehicle {
    public void start() { System.out.println("Bike started"); }
    public void stop()  { System.out.println("Bike stopped"); }
}

class Truck implements Vehicle {
    public void start() { System.out.println("Truck started"); }
    public void stop()  { System.out.println("Truck stopped"); }
}

class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        switch(type.toLowerCase()) {
            case "car": return new Car();
            case "bike": return new Bike();
            case "truck": return new Truck();
            default: return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.getVehicle("car");
        v.start();
    }
}

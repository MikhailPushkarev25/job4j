package ooa;

public class AirPort {
    public static void main(String[] args) {
        final AirBus airBus = new AirBus("A320");
        System.out.println(airBus);
        airBus.printModel();
        airBus.printCountEngine();

        airBus.setName("A380");
        System.out.println(airBus);
        airBus.printModel();
        airBus.printCountEngine();
    }
}

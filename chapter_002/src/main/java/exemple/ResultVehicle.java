package exemple;

public class ResultVehicle {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] sum = new Vehicle[] {plane, train, bus};
        for (Vehicle vehicle : sum) {
            vehicle.move();
            vehicle.colour();
            vehicle.weight();
        }
    }
}

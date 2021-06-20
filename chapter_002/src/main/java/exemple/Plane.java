package exemple;

public class Plane  implements Vehicle {

    @Override
    public void move() {
        System.out.println("Самолет - Летает");
    }

    @Override
    public void colour() {
        System.out.println("Белый");
    }

    @Override
    public void weight() {
        System.out.println("136 тонн");
    }
}

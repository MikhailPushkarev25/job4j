package exemple;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Автобус - Едет по трассе");
    }

    @Override
    public void colour() {
        System.out.println("Красный");
    }

    @Override
    public void weight() {
        System.out.println("10 тонн");
    }
}

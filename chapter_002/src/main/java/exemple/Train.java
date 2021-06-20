package exemple;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Поезд - Едет по рельсам");
    }

    @Override
    public void colour() {
        System.out.println("Серый");
    }

    @Override
    public void weight() {
        System.out.println("6_545 тонн");
    }
}

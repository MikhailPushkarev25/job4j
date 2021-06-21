package ooa;

public class AirBus {

    private static final int COUNT_ENGINE = 2;

    private String name;

    public AirBus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        if (name.equals("A380")) {
            System.out.println("Колличество двигателей равно: " + 4);
        } else {
            System.out.println("Колличество двигателей равно: " + COUNT_ENGINE);
        }
    }

    @Override
    public String toString() {
        return "AirBus{" + "name='" + name + '\'' + '}';
    }
}

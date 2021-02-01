package ru.job4j.oop;

/**
 * Class Cat - В этом классе я добавил метод с возвращаемым типом
 * и показываю как работает этот метод
 */
public class Cat {

    /**
     * @ sound - метод с возвращаемым типом.
     */
    public String sound() {
        String voice = "may - may";
        return voice;
    }

    /**
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
    }
}

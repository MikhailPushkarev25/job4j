package ru.job4j.oop;

/**
 * Class Cat - В этом классе я добавил метод с возвращаемым типом
 * и показываю как работает этот метод, Так же поля.
 */
public class Cat {

    /**
     * Поле
     */
    private String food;
    private String name;

    /**
     * Вывод поля
     */
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    /**
     *
     * @param meat - запись строки в поле.
     */
    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

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
        System.out.println();
        System.out.println("There are gav food");
        Cat gav = new Cat();
        gav.giveNick("Pushok");
        gav.eat("Kotleta");
        gav.show();
        System.out.println("There are black food");
        Cat black = new Cat();
        black.giveNick("Big");
        black.eat("Fish");
        black.show();
    }
}

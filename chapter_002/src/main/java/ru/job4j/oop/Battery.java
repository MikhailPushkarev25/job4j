package ru.job4j.oop;

/**
 * Использую принцип ООП
 */
public class Battery {
    /**
     * Поле класса
     */
    private int load;

    /**
     * Конструктор для инициализации обьекта
     * @param size - параметр, принимает значение
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * Метод вычисления
     * @param another - принимает паремтр обьект класса
     */
    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    /**
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Battery one = new Battery(100);
        Battery two = new Battery(25);
        System.out.println("Charge one: " + one.load + " % " + " Charge two: " + two.load + " % ");
        one.exchange(two);
        System.out.println("Charge one: " + one.load + " % " + " Charge two: " + two.load + " % ");
    }
}

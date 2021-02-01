package ru.job4j.oop;

/**
 * В этом классе я показываю как работает
 * метод с аргументом, далее вызываю
 * метод через обьект.
 */

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox number = new Jukebox();
        int pos = 1;
        int num = 2;
        int not = 10;
        System.out.print("Номер выбранной песни: ");
        number.music(pos);
        System.out.println();
        number.music(num);
        System.out.println();
        number.music(not);
    }
}

package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author Mikhail Pushkarev
 * @since 02.02.2021
 * @version 2.2
 *
 * Рефакторинг кода из первой части
 * Так же добавил возможность рассчета расстояние между точками в трехмерном пространствею.
 */
public class Point {

    /**
     * Поле класса
     */
    private int x;

    /**
     * Поле класса
     */
    private int y;
    /**
     * Поле класса
     */
    private int z;

    /**
     * Конструктор, принимает два параметра и инициализирует обьект
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Перегруженный конструктор
     * @param x - аргумент
     * @param y - аргумент
     * @param z - аргумент
     */
    public Point (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод вычисления расстояния прямой от точки а до точки b
     * @param that - Принимает параметр второго обьекта
     * @return - Возвращает результат на консоль
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.y, 2) + pow(this.y - that.x, 2));
    }

    /**
     * Метод принимает аргумент, так же он имеет возможность
     * рассчитать расстояние между точек в трехмерном пространстве.
     * @param that - параметр
     * @return - вернуть результат.
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.y, 2) + pow(this.y - that.x, 2) + pow(this.z - that.z, 2));
    }

    /**
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}

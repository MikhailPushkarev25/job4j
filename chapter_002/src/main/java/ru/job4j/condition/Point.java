package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Рефакторинг кода из первой части
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
     * Конструктор, принимает два параметра и инициализирует обьект
     */

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
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

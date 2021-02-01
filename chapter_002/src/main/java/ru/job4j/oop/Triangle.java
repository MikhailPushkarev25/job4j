package ru.job4j.oop;

import ru.job4j.condition.Point;

/**
 * В этом классе я использую поиск площади треугольника
 * с помощью обьектов и класса Point
 *
 * @author Mikhail Pushkarev
 * @since 02.01.2021
 * @version 2.2
 * */
public class Triangle {

    /**
     * Поля обьекта, я использую поле класса Point
     */
    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор для инициализации
     * @param ap - сторона треугольника
     * @param bp - сторона треугольника
     * @param cp - сторона треугольника
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Найти полупериметр тругольника
     * @param a
     * @param b - стороны треугольника
     * @param c
     * @return - вернуть результат
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Проверяю что такой треугольник есть
     * @param ab
     * @param ac - стороны треугольника
     * @param bc
     * @return
     */
    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ab + bc) > ac && (ac + bc) > ab;
    }

    /**
     * Метод Вычисляет площадь треугольника в классе Point
     * далее создаем переменную и записываем полупериметр
     * далее проверяем что мы вычислили площадь треугольника
     * @return
     */
        public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

}

package ru.job4j.startegy;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В этом классе я создал макет треугольника (псевдографика)
 */
public class Triangle implements Shape {

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "    ^    " + ln
                + "  /   \\ " + ln
                + " /_____\\" + ln;

    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}

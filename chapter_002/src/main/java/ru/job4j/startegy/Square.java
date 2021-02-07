package ru.job4j.startegy;

/**
 * @author Mikhail Pushkarev
 * @since 07.02.2021
 * @version 2.2
 * В этом классе я создал псеводграфику квадрат
 */
public class Square implements Shape {


    @Override
    public String draw() {
        String sqr = System.lineSeparator();
        return    " -------- " + sqr
                + "|        |" + sqr
                + "|        |" + sqr
                + "|        |" + sqr
                + " -------- " + sqr;
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}

package ru.job4j.condition;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.20221
 * @version 2.2
 *
 * В этом классе нужно проверить сможет ли фигура ладья в шахматах
 * победить другую фигуру
 * для этого нужно узнать находяться ли фигуры на одной линии
 * я с помощью поиска символов charAT нашел идентичные клетки и вернул истенный результат
 * значит фигуры находятся на одной линии
 */
public class AttackRook {

    public static boolean check(String left, String right) {
        return left.charAt(1) == right.charAt(1) || left.charAt(0) == right.charAt(0);
    }
}

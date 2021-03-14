package ru.job4j.jambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mikhail Pushkarev
 * @since 14.03.2021
 * @version 2.2
 *
 * В классе я создал метод конвертации двумерного массива в список и написал тест проверку
 * метод принимает двумерный массив в поток, далее метод flatMAp
 * принимет параемтр потока и конвертирует в список.
 */
public class ListMatrix {

    public static List<Integer> matrix(Integer[][] num) {
        return Arrays.stream(num).flatMap(
                Arrays::stream
        ).collect(Collectors.toList());
    }
}

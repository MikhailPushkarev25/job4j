package ru.job4j.loop;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * В этом классе нужно сделать так что бы длина отрезка section убралась в длину
 * length
 * то есть нужно найти колличество отрезков которые уберуться в length
 * цикл whule мне помог в этом
 */
public class SectionCount {

    public static int count(int length, int section) {
        int line = 0;
        while (section <= length) {
            length = length - section;
            line++;
        }
        return line;
    }
}

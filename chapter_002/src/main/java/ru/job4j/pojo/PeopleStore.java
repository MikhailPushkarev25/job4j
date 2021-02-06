package ru.job4j.pojo;

/**
 * @author Mikhail Pushkarev
 * @since 06.02.2021
 * @version 2.2
 *
 * В этом классе я проверяю тестами положение ячейки масива
 */
public class PeopleStore {
    /**
     * В этом методе я проверяю определенную ячейку.
     * Если она null то мы ее возвращаем. Так же если выход за пределы массива
     * ты мы вернем -1;
     * @param people - параметр
     * @return - вернуть результат
     */
    public static int indexOfNull(People[] people) {
        int index = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    /**
     * Метод main выводит на консоль результат кода
     * @param args - параметр
     */
    public static void main(String[] args) {
        People[] people = new People[5];
        people[0] = new People("Mikhail", 25);
        people[1] = new People("Roman", 28);
        people[2] = new People("Lena", 35);
        for (int i = 0; i < people.length; i++) {
            People people1 = people[i];
            if (people1 != null) {
                System.out.println(people1.getName());
            }
        }
        System.out.println();
        People first = new People("Mikhail", 25);
        People second = new People("Mikhail", 25);
        boolean pop = first.equals(second);
        System.out.println(pop);

    }
}

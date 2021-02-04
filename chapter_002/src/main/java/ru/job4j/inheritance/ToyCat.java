package ru.job4j.inheritance;

/**
 * @author Mikhail Pushkarev
 * @since 04.02.2021
 * @version 2.2
 */
public class ToyCat extends Cat {

    /**
     * Этот класс является дочерним.
     * @return - вернуть результат
     */

    public boolean canBeWashByWashMachine() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPurr());
        ToyCat toyCat = new ToyCat();
        System.out.println(toyCat.canPurr());
        System.out.println(toyCat.canBeWashByWashMachine());
    }
}

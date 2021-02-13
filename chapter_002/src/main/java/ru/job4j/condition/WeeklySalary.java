package ru.job4j.condition;

/**
 * @author Mikhail Pushkarev
 * @since 13.02.2021
 * @version 2.2
 *
 * В этом классе нужно рассчитать зарплату работнику с переработками,
 * то есть в обычные будние дни сотрудник получает за час 10 долларов,
 * за каждый час свыше 8 часов он получит 15 долларов
 * за переработки в выходные двойная оплата труда
 * я с помощью условия определил дни недели, далее с помощью арифметики
 * получил ту сумму которая нужна сотруднику
 */
public class WeeklySalary {

    public static int calculate(int[] hours) {
        int day = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i <= 5) {
                if (hours[i] == 8) {
                    day = day + (hours[i] * 10);
                } else if (hours[i] >= 10) {
                    day = day + ((hours[i] * 8) + (hours[i] * 3));
                }
            } else {
                day = day + (hours[i] * 59);
            }
        }
        return day;
    }
}

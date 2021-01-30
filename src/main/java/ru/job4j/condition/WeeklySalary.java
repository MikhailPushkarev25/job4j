package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int res = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    res = res + hours[i] * 10;
                } else {
                    res =180 + (hours[i] * 15);
                 }
            }
            if (i > 5 && hours[i] != 0) {
                res = res + 170 + hours[i] * 20;
            }

            }
        return res;
        }

    }

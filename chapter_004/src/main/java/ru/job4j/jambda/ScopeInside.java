package ru.job4j.jambda;
import java.util.function.Supplier;

/**
 * @author Mikhail Pushkarev
 * @since 22.02.2021
 * @since 2.2
 *
 *  В классе нужно было найти ошибку
 */
public class ScopeInside {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            int nums = num[i];
            int res = total;
            total = add(
                    () -> res + nums
            );
        }
            System.out.println(total);
        }

        private static Integer add(Supplier<Integer> calc) {
            return calc.get();
        }
}

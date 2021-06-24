package function;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 23.06.2021
 * @version 2.2
 *
 * В классе демонстрирую продуктивную работу лямбда
 */

public class Excepted {
    public static void main(String[] args) {
        /**
         * В первом случае я использовал массив с одним элементом
         * далее с помощью компаратора прохожу по убыванию
         * так как элемент один, вывода не будет
         */
        String[] names = {
                "Ivan"
        };

        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);

        String[] name = {
                "Ivan",
                "Roman"
        };

        /**
         * Во втором случает все тоже самое,
         * но уже два элемента и программа сработает
         * так как компаратору есть что делать с элементами
         */

        Comparator<String> length = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(name, length);
    }
}

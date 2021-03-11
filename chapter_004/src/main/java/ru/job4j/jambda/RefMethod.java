package ru.job4j.jambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Mikhail Pushkarev
 * @since 11.03.2021
 * @version 2.2
 * В классе я демонстрирую еще одно упрощение в лямбда выражении
 * оператор :: позволяет сократить часть кода, вместо (name) -> cutOut(name),
 * я сократил оператором ::
 */
public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> consumer = RefMethod::cutOut;
        names.forEach(consumer);
    }

        public static void cutOut(String value) {

        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
        }
    }

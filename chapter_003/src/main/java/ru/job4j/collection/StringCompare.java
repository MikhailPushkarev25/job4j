package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Mikhail Pushkarev
 * @since 18.02.2021
 * @version 2.2
 *
 * В классе я реализовал метод сравния слов по элеменьно,
 * переведя в символы массивов,
 * пройдя по циклу и выбирая наименьший сравниваем в методе compare
 * далее если не равно 0 то выходим
 * если равно 0 то сравниваем длину строки
 */
public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
       char[] first = left.toCharArray();
       char[] second = right.toCharArray();
       int result = 0;
           for (int i = 0; i < Math.min(first.length, second.length); i++) {
               result =  Character.compare(left.charAt(i), right.charAt(i));
               if (result != 0) {
                   break;
               }
           }
               if (result == 0 && first.length != second.length) {
                   result = Integer.compare(first.length, second.length);

           }

        return result;
    }
}

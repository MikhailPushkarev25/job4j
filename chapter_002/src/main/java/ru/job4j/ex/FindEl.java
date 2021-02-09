package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В этом классе я создал метод по поиску индекса в массиве строк
 * так же создал класс для определения исключения, если индекс вышел за пределы массива
 */
public class FindEl {

    /**
     * Метод поиска индекса в массиве строк
     * @param value - массив строк (параметр)
     * @param key - ключ по которому ищем индекс (параметр)
     * @return - возвращаем результат
     * @throws ElementNotFoundException - если индекс вышел за пределы массива,
     * падает исключение которое я указал.
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = 0;
        for (int index = 0; index < value.length; index++) {
            String str = value[index];
            if (str.equals(key)) {
                rsl = index;
            }
        }

        if (rsl == 0) {
            throw new ElementNotFoundException("The element does not exist in the array.");
        }
        return rsl;
    }

    /**
     * Так же в методе main указал блок try catch
     * для поиска ошибки в коде
     * @param args - параметр.
     */
    public static void main(String[] args) {
        String[] value = {"Mikhail", "Roman", "Vasya"};
        String key = "Roman";
        try {
            System.out.println(indexOf(value, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        String keys = "Magnit";
        try {
            System.out.println(indexOf(shops, keys));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

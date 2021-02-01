package ru.job4j.oop;

/**
 * @class DummyDic - показываю как в классе метод с аргументом строк работает.
 */

public class DummyDic {

    /**
     *
     * @param eng - Принимает символ строк заданный в методе main.
     * @return - возвращаем результат на вывод.
     */
    public String engToRus(String eng) {
       System.out.println("Неизвестное слово -  " + eng);
        return eng;
    }

    /**
     *
     * @param args - args
     */
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String str = "Поле";
        dic.engToRus(str);

    }
}

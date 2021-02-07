package ru.job4j.inheritance;

/**
 * класс наследник
 */
public class HtmlReport extends TextReport {
    /**
     * Переопределенный метод
     * @param name - параметр
     * @param body - параметр
     * @return - возвращает результат
     * Так же добавил аннотацию с помощью которой можно проверить правильность именования метода
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}

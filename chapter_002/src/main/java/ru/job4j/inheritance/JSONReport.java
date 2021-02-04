package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    /**
     * Метод наследник
     * переопределили метод
     * @param name - параметр
     * @param body - параметр
     * @return - возвращает результат
     * Добавил аннотацию проверил правильность именования метода
     */
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() +
                  "name" + " : " + name + "," + System.lineSeparator()
                +  "body" + " : " + body + System.lineSeparator() +
                "}";
    }
}

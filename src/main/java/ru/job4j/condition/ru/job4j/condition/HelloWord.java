package ru.job4j.condition.ru.job4j.condition;

public class HelloWord {

    public static String checkNumber(int number) {
        String str = "";
      if (number % 15 == 0) {
          str = "Hello, Word!!!";
      } else if (number % 3 == 0) {
          str = "Hello";
      } else if (number % 5 == 0) {
          str = "Word";
      } else {
          str = "Operation not support";
      }
        return str;
    }
}

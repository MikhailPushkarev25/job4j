package ru.job4j.oop;

public class Max {
    private int[] array;

    public void to(int[] arr) {
        array = arr; // Аргумент должен отличаться от поля обьекта
        // иначе код упадет
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Max max = new Max();
        max.to(array);
        max.print();
    }
}

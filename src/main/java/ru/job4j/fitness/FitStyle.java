package ru.job4j.fitness;

public class FitStyle {

    public static void man(int age) {
        if (age >= 18) {
            System.out.println("We invite you");
        } else {
            System.out.println("Sorry");
        }
    }
    public static void woman(int age) {
        if (age >= 18) {
            System.out.println("We invite you");
        } else {
            System.out.println("Sorry");
        }
    }
    public static void time(int days) {
        for (int i = 1; i <= days; i++) {
            System.out.println("I will go " + i + " days");
        }
    }
    public static void main(String[] args) {
        System.out.println("My nam is Vlad");
        FitStyle.man(23);
        System.out.println("Thanks");
        FitStyle.time(4);
        System.out.println("I walk. Monday, Wednesday, friday, sunday days");
        System.out.println();
        FitStyle.woman(16);
        System.out.println("So sorry");
    }
}

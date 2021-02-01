package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe i can fly");
    }

    public void bayan() {
        System.out.println("Pam para pam pam");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        System.out.println();
        petya.bayan();
        petya.song();
        petya.bayan();
        petya.song();
        petya.bayan();
        petya.song();
    }
}
